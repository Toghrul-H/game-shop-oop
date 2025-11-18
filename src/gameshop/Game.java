/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameshop;

/**
 *
 * @author Totu-vostro-5640
 */
public class Game {
    private String title;
    private String genre;
    private int age;
    private double popularity;
    private double damage;
    private int price;
    private int count;
    private String avability;
    
    /**
     * Creates a game with specified attributes.
     * @param title
     * @param genre
     * @param age
     * @param popularity
     * @param damage
     * @param price
     * @param count
     * @param avability 
     */
    public Game(String title, String genre,int age,double popularity,double damage,int price,int count,String avability){
        this.title = title;
        this.genre = genre;
        this.age = age;
        this.popularity = popularity;
        this.damage = damage;
        this.price = price;
        this.count = count;
        this.avability = avability;
        
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getGenre(){
        return this.genre;
    }
    
    public int getAge(){
        return this.age;
    }
    public double getPop(){
        return this.popularity;
    }
    public double getDamage(){
        return this.damage;
    }
    public int getPrice(){
        return this.price;
    }
    public int getCount(){
        return this.count;
    }
    public String getAvab(){
        return this.avability;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPop(double popularity){
        this.popularity = popularity;
    }
    public void setDamage(double damage){
        this.damage=damage;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setCount(int count){
        this.count=count;
    }
    public void setAvab(String avability){
        this.avability=avability;
    }
    
    
}
