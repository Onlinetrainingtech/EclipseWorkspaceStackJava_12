
public class Sample
{
   public static void main(String as[])
   {
	   ProductModel p=new ProductModel();
	   p.setPid(1001);
	   p.setPname("apple");
	   
	   ProductDAOImpl p1=new ProductDAOImpl();
	   p1.addProduct();
	   p1.viewProduct(p);
   }
}
