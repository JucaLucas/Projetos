package caixeiro_viajante;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Analise {
	static double distancia_Euclidiana(Double latitude1, Double longitude1, Double latitude2, Double longitude2) {
	    double latDiff = latitude1 - latitude2;
	    double lonDiff = longitude1 - longitude2;
	    double x = Math.pow(latDiff, 2);
	    double y = Math.pow(lonDiff, 2);
	    double resultado = Math.sqrt(x + y);
	    return resultado;
	}


	public static void main(String[] args) throws JsonProcessingException {

		// ASDASDASJDFASDFOASDFFFFFFFFFFFFFFFF
		ObjectMapper mapper = new ObjectMapper();
		String json = "{\r\n"
				+ "    \"id\": 1,\r\n"
				+ "    \"nome\": \"McDonalds\",\r\n"
				+ "    \"localizacao\": [-38.9450632, -12.2560224],\r\n"
				+ "    \"endereco\": \"Av. Getúlio Vargas, 1795 - Capuchinhos, Feira de Santana - BA, 44076-015\",\r\n"
				+ "    \"entregas\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 1,\r\n"
				+ "            \"destinatario\": \"Lucas Silva\",\r\n"
				+ "            \"endereco\": \"Travessa Serrolândia, 30, Caseb, Feira de Santana - BA, 44052-168\",\r\n"
				+ "            \"localizacao\": [\r\n"
				+ "                -38.9349956,\r\n"
				+ "                -12.2384015\r\n"
				+ "            ],\r\n"
				+ "            \"produtos\": [\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 12,\r\n"
				+ "                    \"nome\": \"Pizza Hut Brotinho\",\r\n"
				+ "                    \"quantidade\": 1, \r\n"
				+ "                    \"preco_unitario\": 16.90, \r\n"
				+ "                    \"subtotal\": 16.90,\r\n"
				+ "                    \"desconto\": 0.00, \r\n"
				+ "                    \"total\": 16.90\r\n"
				+ "                }\r\n"
				+ "            ],\r\n"
				+ "            \"total_entrega\": 16.90,\r\n"
				+ "            \"total_desconto\": 0.00,\r\n"
				+ "            \"codigo_entrega\": 3542,\r\n"
				+ "            \"pago\": false, \r\n"
				+ "            \"tipo_pagamento\": [\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 5, \r\n"
				+ "                    \"nome\": \"Cartão de Crédito VISA Á vista\",\r\n"
				+ "                    \"bandeira\": \"VISA\"\r\n"
				+ "                }\r\n"
				+ "            ]\r\n"
				+ "        }, \r\n"
				+ "        {\r\n"
				+ "            \"id\": 2,\r\n"
				+ "            \"destinatario\": \"Marcela Almeida\",\r\n"
				+ "            \"endereco\": \"R. Araraquara, 10 - Caseb, Feira de Santana - BA, 44052-061\",\r\n"
				+ "            \"localizacao\": [\r\n"
				+ "                -12.240613,\r\n"
				+ "                -38.943099\r\n"
				+ "            ],\r\n"
				+ "            \"produtos\": [\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 33,\r\n"
				+ "                    \"nome\": \"Pizza Hut Box\",\r\n"
				+ "                    \"quantidade\": 1, \r\n"
				+ "                    \"preco_unitario\": 30.90, \r\n"
				+ "                    \"subtotal\": 30.90,\r\n"
				+ "                    \"desconto\": 0.00, \r\n"
				+ "                    \"total\": 30.90\r\n"
				+ "                },\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 55,\r\n"
				+ "                    \"nome\": \"Coca Cola 1L\",\r\n"
				+ "                    \"quantidade\": 2, \r\n"
				+ "                    \"preco_unitario\": 6.90, \r\n"
				+ "                    \"subtotal\": 13.80,\r\n"
				+ "                    \"desconto\": 0.00, \r\n"
				+ "                    \"total\": 13.80\r\n"
				+ "                }\r\n"
				+ "            ],\r\n"
				+ "            \"total_entrega\": 44.70,\r\n"
				+ "            \"total_desconto\": 0.00,\r\n"
				+ "            \"codigo_entrega\": 3544,\r\n"
				+ "            \"pago\": false, \r\n"
				+ "            \"tipo_pagamento\": [\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 8, \r\n"
				+ "                    \"nome\": \"Cartão de Crédito MASTERCARD Á vista\",\r\n"
				+ "                    \"bandeira\": \"MASTERCARD\"\r\n"
				+ "                }\r\n"
				+ "            ]\r\n"
				+ "        }, \r\n"
				+ "        {\r\n"
				+ "            \"id\": 3,\r\n"
				+ "            \"destinatario\": \"João Pedro\",\r\n"
				+ "            \"endereco\": \"R. Gov. Juraci Magalhães, 870 - Ponto Central, Feira de Santana - BA, 44075-115\",\r\n"
				+ "            \"localizacao\": [\r\n"
				+ "                -12.2467237,\r\n"
				+ "                -38.9514906\r\n"
				+ "            ],\r\n"
				+ "            \"produtos\": [\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 12,\r\n"
				+ "                    \"nome\": \"Pizza Hut Brotinho\",\r\n"
				+ "                    \"quantidade\": 1, \r\n"
				+ "                    \"preco_unitario\": 16.90, \r\n"
				+ "                    \"subtotal\": 16.90,\r\n"
				+ "                    \"desconto\": 0.00, \r\n"
				+ "                    \"total\": 16.90\r\n"
				+ "                },\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 55,\r\n"
				+ "                    \"nome\": \"Coca Cola 1L\",\r\n"
				+ "                    \"quantidade\": 1, \r\n"
				+ "                    \"preco_unitario\": 6.90, \r\n"
				+ "                    \"subtotal\": 6.90,\r\n"
				+ "                    \"desconto\": 0.00, \r\n"
				+ "                    \"total\": 6.90\r\n"
				+ "                }\r\n"
				+ "            ],\r\n"
				+ "            \"total_entrega\": 23.80,\r\n"
				+ "            \"total_desconto\": 0.00,\r\n"
				+ "            \"codigo_entrega\": 3545,\r\n"
				+ "            \"pago\": false, \r\n"
				+ "            \"tipo_pagamento\": [\r\n"
				+ "                {\r\n"
				+ "                    \"id\": 5, \r\n"
				+ "                    \"nome\": \"Cartão de Crédito VISA Á vista\",\r\n"
				+ "                    \"bandeira\": \"VISA\"\r\n"
				+ "                }\r\n"
				+ "            ]\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "    ]\r\n"
				+ "\r\n"
				+ "}";
		
			ArrayList<Double> latitude = new ArrayList<>();
			ArrayList<Double> longitude = new ArrayList<>();
			ArrayList<Double> ponto = new ArrayList<>();

			McDonalds mcdonalds = new McDonalds();
			List<Entrega> entregas = mcdonalds.getEntregas();
		    try {	
		        mcdonalds = mapper.readValue(json, McDonalds.class);
		        entregas = mcdonalds.getEntregas();
		        
	        	double[] mcdonaldsLocalizacao = mcdonalds.getLocalizacao();
	            latitude.add(mcdonaldsLocalizacao[1]);
	            longitude.add(mcdonaldsLocalizacao[0]);

		        for (int i = 0; i < entregas.size(); i++) {
		        	

		            
		            Entrega entrega = entregas.get(i);
		            String destinatario = entrega.getDestinatario();
		            String endereco = entrega.getEndereco();
		            double[] localizacao = entrega.getLocalizacao();

		            latitude.add(localizacao[1]);
		            longitude.add(localizacao[0]);

		            System.out.println("Destinatário: " + destinatario);
		            System.out.println("Endereço: " + endereco);
		            System.out.println("Latitude: " + latitude);
		            System.out.println("Longitude: " + longitude);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    for (int i = 0; i < longitude.size(); i++) {
		        for (int j = i; j < latitude.size(); j++) {
		                double distancia = distancia_Euclidiana(latitude.get(i), longitude.get(i), latitude.get(j), longitude.get(j));
		                System.out.println("A distancia entre os pontos " + i + " e " + j + " é " + distancia);
		            
		        }
		    }
			double distancia_McD_Mcd = 0.0;
			double distancia_McD_Luc = 0.02029415399985944;
			double distancia_McD_Mar = 37.75351265695084;
			double distancia_McD_JoP = 37.755123552631524;
			
			double distancia_Luc_Luc = 0.0;
			double distancia_Luc_Mar = 37.7588523522854;
			double distancia_Luc_JoP = 37.760468565324615;
			
			double distancia_Mar_Mar = 0.0;
			double distancia_Mar_JoP = 0.01038073239468486;
			
			double distancia_JoP_JoP = 0.0;
		    // o ponto 0 significa McDonalds, o ponto 1 significa Lucas, o ponto 2 Significa Marcela, o ponto 3 significa João Pedro.
		    
		    ArrayList<String> localAtual = new ArrayList<>();
		    localAtual.add("McDonalds");
		    System.out.println("Estou em "+localAtual.get(0));
		    System.out.println("Estou partindo para entregar os produtos para Lucas, João Pedro e Marcela, sempre indo pela distancia mais curta do ponto em que estou.");
		    if(distancia_McD_Luc < distancia_McD_Mar && distancia_McD_Luc < distancia_Mar_JoP) {
		    	System.out.println("Decidi entregar primeiro a Lucas, pois ele mora em uma localidade mais próxima do McDonalds.");
		    	localAtual.add("Casa de Lucas");
		    	ponto.add(distancia_McD_Luc);
		    	System.out.println("Estou em "+localAtual.get(1));
		    	System.out.println("Agora partindo de lucas eu irei ver qual é a proxima localidade mais próxima.");
		    		if(distancia_Luc_Mar < distancia_Luc_JoP) {
		    			System.out.println("Decidi ir fazer a entrega para Marcela, Pois ela é o destinatário mais próximo da casa de Lucas.");
		    			localAtual.add("Casa de Marcela");
		    			ponto.add(distancia_Luc_Mar);
		    			System.out.println("Estou em "+localAtual.get(2));
		    			System.out.println("Saindo da casa de marcela");
		    			System.out.println("Como só sobrou o destinatário João Pedro estou indo lá");
		    			localAtual.add("Casa de João Pedro");
		    			ponto.add(distancia_Mar_JoP);
		    			System.out.println("Estou em "+localAtual.get(3));
		    			System.out.println("Agora que ja fiz todas as entregas irei voltar para o mcDonalds");
		    			localAtual.add("McDonalds");
		    			ponto.add(distancia_McD_JoP);
		    			System.out.println("Estou em "+localAtual.get(4));
		    			System.out.println(localAtual);
		    			System.out.println("Distancia percorrida ponto a ponto: "+ ponto);
		    			double Distancia = distancia_McD_Luc + distancia_Luc_Mar + distancia_Mar_JoP + distancia_McD_JoP;
		    			System.out.println("Distancia percorrida: "+Distancia+"Km");
		    			
		    		}
		    		else {
		    		System.out.println("Decidi ir fazer a entrega para João Pedro, Pois ela é o destinatário mais próximo da casa de Lucas.");
	    			localAtual.add("Casa de João Pedro");
	    			ponto.add(distancia_Luc_JoP);
	    			System.out.println("Estou em "+localAtual.get(2));
	    			System.out.println("Saindo da casa de João Pedro");
	    			System.out.println("Como só sobrou o destinatário Marcela estou indo lá");
	    			localAtual.add("Casa de Marcela");
	    			ponto.add(distancia_Mar_JoP);
	    			System.out.println("Estou em "+localAtual.get(3));
	    			System.out.println("Agora que ja fiz todas as entregas irei voltar para o mcDonalds");
	    			localAtual.add("McDonalds");
	    			ponto.add(distancia_McD_JoP);
	    			System.out.println("Estou em "+localAtual.get(4));
	    			System.out.println(localAtual);
	    			System.out.println("Distancia percorrida ponto a ponto: "+ ponto);
	    			double Distancia = distancia_McD_Luc + distancia_Luc_JoP + distancia_Mar_JoP + distancia_McD_Mar;
	    			System.out.println("Distancia percorrida: "+Distancia+"Km");
		    		} 
		    	
		    }
		    else if(distancia_McD_Mar < distancia_McD_Luc && distancia_McD_Mar < distancia_Mar_JoP) {

		    	System.out.println("Decidi entregar primeiro a Marcela, pois ela mora em uma localidade mais próxima do McDonalds.");
		    	localAtual.add("Casa de Marcela");
		    	ponto.add(distancia_McD_Mar);
		    	System.out.println("Estou em "+localAtual.get(1));
		    	System.out.println("Agora partindo de Marcela eu irei ver qual é a proxima localidade mais próxima.");
		    		if(distancia_Luc_Mar < distancia_Mar_JoP) {
		    			System.out.println("Decidi ir fazer a entrega para Lucas, Pois ele é o destinatário mais próximo da casa de Marcela.");
		    			localAtual.add("Casa de Lucas");
		    			ponto.add(distancia_Luc_Mar);
		    			System.out.println("Estou em "+localAtual.get(2));
		    			System.out.println("Saindo da casa de Lucas");
		    			System.out.println("Como só sobrou o destinatário João Pedro estou indo lá");
		    			localAtual.add("Casa de João Pedro");
		    			ponto.add(distancia_Luc_JoP);
		    			System.out.println("Estou em "+localAtual.get(3));
		    			System.out.println("Agora que ja fiz todas as entregas irei voltar para o mcDonalds");
		    			localAtual.add("McDonalds");
		    			ponto.add(distancia_McD_JoP);
		    			System.out.println("Estou em "+localAtual.get(4));
		    			System.out.println(localAtual);
		    			System.out.println("Distancia percorrida ponto a ponto: "+ ponto);
		    			double Distancia = distancia_McD_Mar + distancia_Luc_Mar + distancia_Luc_JoP + distancia_McD_JoP;
		    			System.out.println("Distancia percorrida: "+Distancia+"Km");
		    			
		    		}
		    		else {
		    		System.out.println("Decidi ir fazer a entrega para João Pedro, Pois ele é o destinatário mais próximo da casa de Marcela.");
	    			localAtual.add("Casa de João Pedro");
	    			ponto.add(distancia_Mar_JoP);
	    			System.out.println("Estou em "+localAtual.get(2));
	    			System.out.println("Saindo da casa de João Pedro");
	    			System.out.println("Como só sobrou o destinatário Lucas estou indo lá");
	    			localAtual.add("Casa de Lucas");
	    			ponto.add(distancia_Luc_JoP);
	    			System.out.println("Estou em "+localAtual.get(3));
	    			System.out.println("Agora que ja fiz todas as entregas irei voltar para o mcDonalds");
	    			localAtual.add("McDonalds");
	    			ponto.add(distancia_McD_Luc);
	    			System.out.println("Estou em "+localAtual.get(4));
	    			System.out.println(localAtual);
	    			System.out.println("Distancia percorrida ponto a ponto: "+ ponto);
	    			double Distancia = distancia_McD_Mar + distancia_Mar_JoP + distancia_Luc_JoP + distancia_McD_Luc;
	    			System.out.println("Distancia percorrida: "+Distancia+"Km");
		    		} 
		    	
		    
		    	
		    }
		    else 
		    	System.out.println("Decidi entregar primeiro a João Pedro, pois ele mora em uma localidade mais próxima do McDonalds.");
		    	localAtual.add("Casa de João Pedro");
		    	ponto.add(distancia_McD_JoP);
		    	System.out.println("Estou em "+localAtual.get(1));
		    	System.out.println("Agora partindo de João Pedro eu irei ver qual é a proxima localidade mais próxima.");
		    		if(distancia_Luc_JoP < distancia_Mar_JoP) {
		    			System.out.println("Decidi ir fazer a entrega para Lucas, Pois ele é o destinatário mais próximo da casa de João Pedro.");
		    			localAtual.add("Casa de Lucas");
		    			ponto.add(distancia_Luc_JoP);
		    			System.out.println("Estou em "+localAtual.get(2));
		    			System.out.println("Saindo da casa de Lucas");
		    			System.out.println("Como só sobrou o destinatário Marcela estou indo lá");
		    			localAtual.add("Casa de Marcela");
		    			ponto.add(distancia_Luc_Mar);
		    			System.out.println("Estou em "+localAtual.get(3));
		    			System.out.println("Agora que ja fiz todas as entregas irei voltar para o mcDonalds");
		    			localAtual.add("McDonalds");
		    			ponto.add(distancia_McD_Mar);
		    			System.out.println("Estou em "+localAtual.get(4));
		    			System.out.println(localAtual);
		    			System.out.println("Distancia percorrida ponto a ponto: "+ ponto);
		    			double Distancia = distancia_McD_JoP + distancia_Luc_JoP + distancia_Mar_JoP + distancia_McD_Mar;
		    			System.out.println("Distancia percorrida: "+Distancia+"Km");
		    			
		    			
		    		}
		    		else {System.out.println
		    		("Decidi ir fazer a entrega para Marcela, Pois ela é o destinatário mais próximo da casa de João Pedro.");
	    			localAtual.add("Casa de Marcela");
	    			ponto.add(distancia_Mar_JoP);
	    			System.out.println("Estou em "+localAtual.get(2));
	    			System.out.println("Saindo da casa de Marcela");
	    			System.out.println("Como só sobrou o destinatário Lucas estou indo lá");
	    			localAtual.add("Casa de Lucas");
	    			ponto.add(distancia_Luc_Mar);
	    			System.out.println("Estou em "+localAtual.get(3));
	    			System.out.println("Agora que ja fiz todas as entregas irei voltar para o mcDonalds");
	    			localAtual.add("McDonalds");
	    			ponto.add(distancia_McD_Luc);
	    			System.out.println("Estou em "+localAtual.get(4));
	    			System.out.println(localAtual);
	    			System.out.println("Distancia percorrida ponto a ponto: "+ ponto);
	    			double Distancia = distancia_McD_JoP + distancia_Mar_JoP + distancia_Luc_Mar + distancia_McD_Luc;
	    			System.out.println("Distancia percorrida: "+Distancia+"Km");
		    	
		    } 
		    		
		    		AVLTree avlTree = new AVLTree();
		    		//Teste da arvore avl
		    		// Adicionando id do mcdonalds
		    		avlTree.insert(mcdonalds.getId());
		    		//Buscando o id adicionado
		    		System.out.println(avlTree.search(mcdonalds.getId())); 
		    		//Procurando numero aleatório para confirmar funcionamento
		    		System.out.println(avlTree.search(6));
		    		//Deletando o id
		    		avlTree.delete(mcdonalds.getId());
		    		//Confirmando se foi deletado
		    		System.out.println(avlTree.search(mcdonalds.getId()));
		    		
		    		//Inserindo numeros aleatorios para confirmar se está sendo balanceada automaticamente
		    		avlTree.insert(mcdonalds.getId());
		    		avlTree.insert(112);
		    		avlTree.insert(9);
		    		avlTree.insert(40);
		    		avlTree.insert(11);
		    		avlTree.insert(12);
		    		// Confirmando se está balanceada
		    		avlTree.inorderTraversal();
		    		
		    		
		    		//________________________________________________________________________
		    		
		    		AVLTree  pedido_id = new AVLTree();
		    		for (Entrega entrega : entregas) {
		    		    int idEntrega = entrega.getId();
		    		    pedido_id.insert(idEntrega);
		    		    }
		    		System.out.print("\n \n Id dos pedidos: ");
		    		pedido_id.inorderTraversal();
		    		
		    		AVLTree estabelecimento_id = new AVLTree();
		    			estabelecimento_id.insert(mcdonalds.getId()); 
		    			System.out.print("\n Id do estabelecimento: ");
		    			estabelecimento_id.inorderTraversal();
		    			
		    			AVLTree id_pedidos = new AVLTree();
		    			  List<Entrega> entregas1 = mcdonalds.getEntregas();
		    					  for (Entrega entrega : entregas1) {
		    					          List<Produto> produtos = entrega.getProdutos();
		    					          for (Produto produto : produtos) {
		    					              id_pedidos.insert(produto.getId());
		    					                }
		    					          
		    				      	}
		    					  System.out.print("\n Id Produtos: ");
		    					  id_pedidos.inorderTraversal();

		
	}
	
	
	
		    	
}
		
		
		
		


	
	
