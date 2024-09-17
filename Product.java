public class Product{
    private String name;
    private String type;
    private String place;
    private int warranty;
    
    public Product(){

    }

    public Product(String name,String type,String place,int warranty){
        this.name=name;
        this.type=type;
        this.place=place;
        this.warranty=warranty;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type ){
        this.type=type ;
    }
    public String getplace(){
        return place;
    }
    public void setplace(String place){
        this.place=place;
    }
    public int getwarranty(){
        return warranty;
    }
    public void setwarranty(int warranty){
        this.warranty=warranty;
    }
    public String toString(){
        return "Product{" +
        "name='"+ name +'\''+
        ",type='"+ type +'\''+
        ",place='"+ place +'\''+
        ",warranty= "+ warranty +'}';
    }
    }