/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author anna
 */
public class Main {
    public static void main(String[] args)
    {
        Client client = ClientBuilder.newClient();
        String count =
        client.target("http://localhost:8080/Complaints/" +
         "resources/complaint/count")
        .request(MediaType.TEXT_PLAIN)
        .get(String.class);

        System.out.println("Count: " + count);
        
        String complaints =
        client.target("http://localhost:8080/Complaints/" +
         "resources/complaint")
        .request(MediaType.APPLICATION_JSON)
        .get(String.class);

        System.out.println("Complaints: " + complaints);
        
        System.out.println("Id of complaint:");
        String complaintId="";
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)); 
        try {
            complaintId = reader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String complaint =
        client.target("http://localhost:8080/Complaints/" +
         "resources/complaint/"+complaintId)
        .request(MediaType.APPLICATION_JSON)
        .get(String.class);

        System.out.println("Complaint with id "+complaintId+": " + complaint);
        
        String openedComplaints =
        client.target("http://localhost:8080/Complaints/" +
         "resources/complaint?status=open")
        .request(MediaType.APPLICATION_JSON)
        .get(String.class);

        System.out.println("Opened complaints: " + openedComplaints);

        client.close();
    }
    
}
