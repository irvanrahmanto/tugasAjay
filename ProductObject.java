package productobject;

public class ProductObject {
//    Melakukan enakpsulasi pada atribut dari product yaitu myType
    protected String myType = "Book";
    
//    Mendefisnisikan class Product
    public ProductObject(){
        
    }    
    
    public static void main(String[] args) {         
//         Mendefinisikan Object baru yaitu myProduct pada class ProductObject2
         ProductObject2 myProduct = new ProductObject2();         
         
//         Mencetak Object baru myProduct serta mendeklarasikan Type nya
         System.out.println(myProduct.getClass());
     }
}
