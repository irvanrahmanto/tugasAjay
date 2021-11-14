package productobject;

class ProductObject4 {
//    Mendeklarasikan atribut dari Product serta melakukan enkapsulasi yang bersifat private
    private String myType;
    private String myTittle;
    
    public ProductObject4(){
        
    }
    
    public ProductObject4(String type, String tittle){
        this.myType=type;
        this.myTittle=tittle;
    }

//    Menerapkan getter pada atribut MyType 
    public String getMyType() {
        return myType;
    }
    
//    Menerapkan setter pada atribut MyType
    public void setMyType(String myType) {
        this.myType = myType;
    }
    
//    Mendeklarasikan getter pada atribut my tittle
    public String getMyTittle() {
        return myTittle;
    }
    
//    mendeklarasikan setter pada atribut my tittle

    public void setMyTittle(String myTittle) {
        this.myTittle = myTittle;
    }

    
//    Mendeklarasikan main program
    public static void main(String[] args) {
        
//        Mendeklarasikan variabel myProduct sebagai new Object
        ProductObject4 myProduct = new ProductObject4();
        
//        Mencetak myProduct sebagai object baru
        System.out.println(myProduct);
    }

}
