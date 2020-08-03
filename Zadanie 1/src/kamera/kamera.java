
package kamera;

public class kamera {


    public static void main(String[] args) {
        Point p=new Point();
        Rectangle rectangle=new Rectangle();
        int count=0;
        int j = 0;
        for(int i=p.y+40;i<=rectangle.height;i+=40)
            {
             if(rectangle.width-j==rectangle.width){
                 for(j=p.x;j<rectangle.width;j+=40)
                {
                 count++;
                }
             }
             else{
             for(int k=rectangle.width;k>p.x;k-=40){
                        count++;
                        j=p.x;
                 }
             }
             
             
            }
                System.out.println("wykonano ujęć: "+count);
            
        
        
    }
    
}
