/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.Serializable;

/**
 *
 * @author anna
 */
public class Complaint implements Serializable{
    private Long id;
    private String complaintDate;
    private String complaintText;
    private String author;
    private String status;
    public Complaint() {
    }
    public Complaint(Long id, String complaintDate, String complaintText, String author, String status) {
        this.id = id;
        this.complaintDate = complaintDate;
        this.complaintText = complaintText;
        this.author = author;
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", complaintDate=" + complaintDate + ", complaintText=" + complaintText + ", author=" + author + ", status=" + status + '}';
    }
    

    /**
     * @return the complaintDate
     */
    public String getComplaintDate() {
        return complaintDate;
    }

    /**
     * @param complaintDate the complaintDate to set
     */
    public void setComplaintDate(String complaintDate) {
        this.complaintDate = complaintDate;
    }

    /**
     * @return the complaintText
     */
    public String getComplaintText() {
        return complaintText;
    }

    /**
     * @param complaintText the complaintText to set
     */
    public void setComplaintText(String complaintText) {
        this.complaintText = complaintText;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
