/**
 * Address Class
 */
import java.util.Scanner;

class Address{
    String street;
    String city;
    String province;
    String postalCode;

    public String toString(){
        return this.street + " " + this.city + ", " + this.province + ", " + this.postalCode;
    }
}
/**
 * toString() : void
 * Overrides the default toString() method.
 * This will format the address in the form of
 *
 * street
 * city, province
 * postalCode
 *
 * @return
 *          String consisting of a formatted mailing address.
 */
public class address{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Address[] addressBook = new Address[5];
        for (int i = 0; i < 5; i++) {
            addressBook[i] = new Address();
            addressBook[i].street = scan.nextLine();
            addressBook[i].city   = scan.nextLine();
            addressBook[i].province  = scan.nextLine();
            addressBook[i].postalCode    = scan.nextLine();
            scan.skip("\n");
        }
        scan.close();

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + addressBook[i]);
        }
    }
}
