public class Circle {
//   Circle деген класс тузунуз, анын PI деген свойствасы, area
//жана circumference деген статик методдору болсун.
//areaны табуу учун: PI * (radius * radius)
//circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат


   private static final double PI=3.14;

   public static double area(double radius){
return PI*(radius*radius);
}
public static double circumference(double radius){
   return PI*2*radius;
   }


}




