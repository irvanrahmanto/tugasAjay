package productobject;

class ProductObject3 {
//    Mendeklarasikan atribut dari Product serta melakukan enkapsulasi yang bersifat private
    private String myType;
    private String myTittle;
    
    public ProductObject3(){
        
    }

//    Menerapkan getter pada atribut MyType 
    public String getMyType() {
        return myType;
    }

//    Menerapkan setter pada atribut MyType
    public void setMyType(String myType) {
        this.myType = myType;
    }
    
//    Mendeklarasikan main program
    public static void main(String[] args) {
        
//        Mendeklarasikan variabel myProduct sebagai new Object
        ProductObject3 myProduct = new ProductObject3();
        
//        Mencetak myProduct sebagai object baru
        System.out.println(myProduct);
        
    }
}
