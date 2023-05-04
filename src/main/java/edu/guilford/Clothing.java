package edu.guilford;

abstract class Clothing implements Comparable<Clothing>{
    protected String brand;
    protected String color;
    protected String size;
    protected String material;

    // make a constructor for Clothing
    public Clothing(String brand, String color, String size, String material) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.material = material;
    }

    //get description abstract method
    public abstract String getDescription();

    //compareTo method that compares the brand of two clothing objects
    public int compareTo(Clothing other) {
        return this.brand.compareTo(other.brand);
    }

    //create an inherited method 
    public void wash() {
        System.out.println("Washing the " + this.color + " " + this.brand + " " + this.getClass().getSimpleName() + ".");
    }



    /// getters and setters for brand, color, size, and material

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize() {
        this.size = size;
    }

    public void setMaterial() {
        this.material = material;
    }
}

class Shirt extends Clothing {
    private String sleeveLength;

    //create a constructor for shirt that calls the constructor for clothing
    public Shirt(String brand, String color, String size, String material, String sleeveLength) {
        super(brand, color, size, material);
        this.sleeveLength = sleeveLength;
    }

    //get description method
    public String getDescription() {
        return "This shirt is a " + this.color + " " + this.brand + " shirt made of " + this.material + " with " + this.sleeveLength + " sleeves.";
    }


    // getters and setters for sleeveLength

    public String getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(String sleeveLength) {
        this.sleeveLength = sleeveLength;
    }
    
}

class Pants extends Clothing {
    private String pantLength;

    //create a constructor for pants that calls the constructor for clothing
    public Pants(String brand, String color, String size, String material, String pantLength) {
        super(brand, color, size, material);
        this.pantLength = pantLength;
    }

    //get description method
    public String getDescription() {
        return "These pants are " + this.color + " " + this.brand + " pants made of " + this.material + " with " + this.pantLength + " legs.";
    }


    // getters and setters for pantLength

    public String getPantLength() {
        return pantLength;
    }

    public void setPantLength(String pantLength) {
        this.pantLength = pantLength;
    }
    
}

class Socks extends Clothing {
    private String sockLength;

    //create a constructor for socks that calls the constructor for clothing
    public Socks(String brand, String color, String size, String material, String sockLength) {
        super(brand, color, size, material);
        this.sockLength = sockLength;
    }

    //get description method
    public String getDescription() {
        return "These socks are " + this.color + " " + this.brand + " socks made of " + this.material + " with " + this.sockLength + " legs.";
    }

    // getters and setters for sockLength

    public String getSockLength() {
        return sockLength;
    }

    public void setSockLength(String sockLength) {
        this.sockLength = sockLength;
    }
    
   

}