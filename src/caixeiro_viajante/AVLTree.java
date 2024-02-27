package caixeiro_viajante;

public class AVLTree {
	    private Node root;

	    private class Node {
	        int key;
	        int height;
	        Node left, right;

	        Node(int d) {
	            key = d;
	            height = 1;
	        }
	    }

	    // Retorna a altura de um n�
	    private int height(Node N) {
	        if (N == null)
	            return 0;
	        return N.height;
	    }

	    // Retorna o m�ximo de dois n�meros inteiros
	    private int max(int a, int b) {
	        return (a > b) ? a : b;
	    }

	    // Rotaciona � direita sub�rvore enraizada em y
	    private Node rightRotate(Node y) {
	        Node x = y.left;
	        Node T2 = x.right;

	        // Realiza a rota��o
	        x.right = y;
	        y.left = T2;

	        // Atualiza alturas
	        y.height = max(height(y.left), height(y.right)) + 1;
	        x.height = max(height(x.left), height(x.right)) + 1;

	        // Retorna novo n� raiz
	        return x;
	    }

	    // Rotaciona � esquerda sub�rvore enraizada em x
	    private Node leftRotate(Node x) {
	        Node y = x.right;
	        Node T2 = y.left;

	        // Realiza a rota��o
	        y.left = x;
	        x.right = T2;

	        // Atualiza alturas
	        x.height = max(height(x.left), height(x.right)) + 1;
	        y.height = max(height(y.left), height(y.right)) + 1;

	        // Retorna novo n� raiz
	        return y;
	    }

	    // Retorna o fator de balanceamento do n� N
	    private int getBalance(Node N) {
	        if (N == null)
	            return 0;
	        return height(N.left) - height(N.right);
	    }

	    // Insere um novo n� com a chave d na sub�rvore enraizada no n� raiz y
	    private Node insert(Node node, int key) {
	        // Realiza a inser��o normal de BST
	        if (node == null)
	            return (new Node(key));

	        if (key < node.key)
	            node.left = insert(node.left, key);
	        else if (key > node.key)
	            node.right = insert(node.right, key);
	        else // Duplicatas n�o s�o permitidas
	            return node;

	        // Atualiza a altura do n� pai
	        node.height = 1 + max(height(node.left), height(node.right));

	        // Obt�m o fator de balanceamento deste n� para verificar se ele se tornou desequilibrado
	        int balance = getBalance(node);

	        // Caso de desequil�brio � esquerda-esquerda
	        if (balance > 1 && key < node.left.key)
	            return rightRotate(node);

	        // Caso de desequil�brio � direita-direita
	        if (balance < -1 && key > node.right.key)
	            return leftRotate(node);

	        // Caso de desequil�brio � esquerda-direita
	        if (balance > 1 && key > node.left.key) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }

	        // Caso de desequil�brio � direita-esquerda
	        if (balance < -1 && key < node.right.key) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }

	        // Nenhuma rota��o foi necess�ria
	        return node;
	    }

	    // M�todo p�blico para inser��o
	    public void insert(int key) {
	        root = insert(root, key);
	    }

	    // Fun��o auxiliar que retorna o n� com o valor m�nimo encontrado na �rvore
	    private Node minValueNode(Node node) {
	        Node current = node;

	        // Percorre a �rvore para encontrar o n� mais � esquerda
	        while (current.left != null)
	            current = current.left;

	        return current;
	    }
	 // Busca um valor na �rvore
	    public boolean search(int key) {
	        return search(root, key);
	    }

	    // Fun��o auxiliar para realizar a busca
	    private boolean search(Node node, int key) {
	        if (node == null) {
	            
	    return false; // Valor n�o encontrado
	        }

	        if (key == node.key) {
	            return true; // Valor encontrado
	        } else if (key < node.key) {
	            return search(node.left, key);
	        } else {
	            return search(node.right, key);
	        }
	    }


	    // Deleta um n� com chave d da sub�rvore enraizada em y
	    private Node deleteNode(Node root, int key) {
	        // Realiza a exclus�o normal de BST
	        if (root == null)
	            return root;

	        // Se a chave a ser exclu�da est� menor que a raiz, ent�o ela est� na sub�rvore � esquerda
	        if (key < root.key)
	            root.left = deleteNode(root.left, key);

	        // Se a chave a ser exclu�da est� maior que a raiz, ent�o ela est� na sub�rvore � direita
	        else if (key > root.key)
	            root.right = deleteNode(root.right, key);

	        // Se a chave a ser exclu�da � igual � raiz, ent�o este � o n� a ser exclu�do
	        else {
	            // N� com apenas um filho ou sem filho
	            if ((root.left == null) || (root.right == null)) {
	                Node temp = null;
	                if (temp == root.left)
	                    temp = root.right;
	                else
	                    temp = root.left;

	                // Caso sem filho
	                if (temp == null) {
	                    temp = root;
	                    root = null;
	                } else // Caso de um filho
	                    root = temp; // Copia os conte�dos do n� n�o nulo
	            } else {
	                // N� com dois filhos: Obt�m o sucessor em ordem (o menor � direita)
	                Node temp = minValueNode(root.right);

	                // Copia o sucessor em ordem para este n�
	                root.key = temp.key;

	                // Exclui o sucessor em ordem
	                root.right = deleteNode(root.right, temp.key);
	            }
	        }

	        // Se a �rvore tinha apenas um n�, ent�o retorna
	        if (root == null)
	            return root;

	        // Atualiza a altura do n� atual
	        root.height = max(height(root.left), height(root.right)) + 1;

	        // Obt�m o fator de balanceamento deste n� para verificar se ele se tornou desequilibrado
	        int balance = getBalance(root);

	        // Caso de desequil�brio � esquerda-esquerda
	        if (balance > 1 && getBalance(root.left) >= 0)
	            return rightRotate(root);

	        // Caso de desequil�brio � esquerda-direita
	        if (balance > 1 && getBalance(root.left) < 0) {
	            root.left = leftRotate(root.left);
	            return rightRotate(root);
	        }

	        // Caso de desequil�brio � direita-direita
	        if (balance < -1 && getBalance(root.right) <= 0)
	            return leftRotate(root);

	        // Caso de desequil�brio � direita-esquerda
	        if (balance < -1 && getBalance(root.right) > 0) {
	            root.right = rightRotate(root.right);
	            return leftRotate(root);
	        }

	        return root;
	    }

	    // M�todo p�blico para exclus�o
	    public void delete(int key) {
	        root = deleteNode(root, key);
	    }

	    // Fun��o auxiliar para percorrer a �rvore em ordem
	    private void inorderTraversal(Node root) {
	        if (root != null) {
	            inorderTraversal(root.left);
	            System.out.print(root.key + " ");
	            inorderTraversal(root.right);
	        }
	    }

	    // M�todo p�blico para percorrer a �rvore em ordem
	    public void inorderTraversal() {
	        inorderTraversal(root);
	        
	        
	    }
	    
	
   }

	    


