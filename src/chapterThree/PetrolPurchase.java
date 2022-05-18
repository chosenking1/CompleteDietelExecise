package chapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantity, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount / 100;
    }



    public void setStationLocation(String location){
        stationLocation = location;
    }

    public String getStationLocation(){
        return stationLocation;
    }
    public void setTypeOfPetrol(String product){
        typeOfPetrol = product;
    }
    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }
    public void setQuantity(int numberOfQuantity){
        quantity = numberOfQuantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPricePerLitre(double price){
        pricePerLitre = price;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount(int quantity,double price, int discount){
        double realDiscount =   (discount / 100.0) * (quantity * price);
        double netPurchase = (quantity * price) - realDiscount;

        return  netPurchase;
    }
}
