package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URLEncoder;
//import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@SpringBootApplication
public class DemoApplication {

/*	@Autowired
    private ThymeleafProperties properties;

    @Value("${spring.thymeleaf.templates_root:}")
    private String templatesRoot;
*/	
	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		
		///////////////////////////////////////////////////////////////
		
		KDTree kdTree = new KDTree();

        // Insertar nodos en el árbol
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.670002, -58.561862}, 1, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.673341, -58.557387}, 2, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.675834, -58.554056}, 3, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.679651, -58.550551}, 4, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.675697, -58.555838}, 5, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.673207, -58.559194}, 6, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.670594, -58.564479}, 7, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.673942, -58.559996}, 8, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.680272, -58.551504}, 9, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.679681, -58.554081}, 10, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.675479, -58.559670}, 11, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.671713, -58.564700}, 12, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.672353, -58.565412}, 13, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.676103, -58.560386}, 14, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.680387, -58.554780}, 15, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.682082, -58.554107}, 16, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.678493, -58.558933}, 17, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.674276, -58.564521}, 18, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.670894, -58.570787}, 19, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.673768, -58.566862}, 20, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.677523, -58.561969}, 21, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.681714, -58.556356}, 22, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.683318, -58.555822}, 23, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.679019, -58.561554}, 24, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.674821, -58.567155}, 25, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.672388, -58.570455}, 26, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.675524, -58.567817}, 27, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.679684, -58.562297}, 28, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.683931, -58.556664}, 29, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.681993, -58.560870}, 30, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.677813, -58.566389}, 31, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.674907, -58.570276}, 32, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.674359, -58.572704}, 33, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.676861, -58.569412}, 34, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.681084, -58.563832}, 35, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.685068, -58.558453}, 36, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.685049, -58.560016}, 37, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.680875, -58.565524}, 38, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.677057, -58.570598}, 39, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.674109, -58.574361}, 40, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.676710, -58.572390}, 41, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.678843, -58.569584}, 42, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.682268, -58.565164}, 43, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.683881, -58.564914}, 44, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.679719, -58.570010}, 45, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.677271, -58.573187}, 46, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.678180, -58.573236}, 47, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.680830, -58.569741}, 48, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.681546, -58.570561}, 49, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.678934, -58.574022}, 50, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.676117, -58.577610}, 51, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.679157, -58.575358}, 52, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.681594, -58.572051}, 53, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.680775, -58.574899}, 54, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.678032, -58.578433}, 55, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.679705, -58.577429}, 56, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.680285, -58.578076}, 57, 0));
		kdTree.setRoot(kdTree.insert(kdTree.getRoot(), new double[]{-34.679625, -58.580225}, 58, 0));
		
        // Realizar otras operaciones en el árbol, como búsqueda, eliminación, etc.

        // Borrar el árbol
        //kdTree.clearTree(kdTree.root);
		
		///////////////////////////////////////////////////////////////
		
		String apiUrl = "http://127.0.0.1:8000/prediccion/";  // Reemplaza con la URL de tu API
        double latitud = -34.678050;  // Valor de latitud
        double longitud = -58.564521;  // Valor de longitud

        // Codifica los parámetros en la URL
        String parametros = String.format("?latitud=%s&longitud=%s",
                URLEncoder.encode(String.valueOf(latitud), StandardCharsets.UTF_8),
                URLEncoder.encode(String.valueOf(longitud), StandardCharsets.UTF_8));

        // Crea una instancia de HttpClient
        HttpClient httpClient = HttpClients.createDefault();

        // Crea una solicitud HTTP GET con la URL completa
        HttpGet httpGet = new HttpGet(apiUrl + parametros);

        try {
            // Ejecuta la solicitud y obtiene la respuesta
            HttpResponse response = httpClient.execute(httpGet);

            // Obtiene el contenido de la respuesta como una cadena
            String responseBody = EntityUtils.toString(response.getEntity());

            // Procesa la respuesta como desees
            System.out.println("Respuesta: " + responseBody);
            
            ///////////////////////////////////////////////////////// obtener latitud y longitud del json de respuesta
            
            try {
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(responseBody);

                JSONArray predictionArray = (JSONArray) jsonObject.get("prediccion");
                JSONArray coordinatesArray = (JSONArray) predictionArray.get(0);

                double latitude = (double) coordinatesArray.get(0);
                double longitude = (double) coordinatesArray.get(1);

                System.out.println("Latitud: " + latitude);
                System.out.println("Longitud: " + longitude);
                
                //////////////////////////////////Llamo a la funcion search range para buscar el punto mas cercano
                // Ejemplo de búsqueda en un rango
                double[] targetPoint = {latitude, longitude};  // Coordenada actual
                double radius = 0.005;  // Radio en unidades de latitud/longitud

                // Buscar nodo con el peso más grande dentro del radio especificado
                NodeWithWeight maxNode = new NodeWithWeight(null, Integer.MIN_VALUE);
                maxNode = kdTree.searchRange(kdTree.getRoot(), targetPoint, radius, 0, maxNode);
                
                //NodeWithWeight result = kdTree.searchRange(kdTree.getRoot(), targetPoint, radius, 0);

                if (maxNode.getNode() != null) {
                    System.out.println("Coordenada: " + Arrays.toString(maxNode.getNode().getPoint()) + " Peso: " + maxNode.getNode().getWeight());
                } else {
                    System.out.println("No se encontraron nodos dentro del rango especificado");
                }
                
                /////////////////////////////////////////////////////////
                
            } catch (ParseException e) {
                e.printStackTrace();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
  /*  @Bean
    public ITemplateResolver defaultTemplateResolver() {
        FileTemplateResolver resolver = new FileTemplateResolver();
        resolver.setSuffix(properties.getSuffix());
        resolver.setPrefix(templatesRoot);
        resolver.setTemplateMode(properties.getMode());
        resolver.setCacheable(properties.isCache());
        return resolver;
    }
    */
}
