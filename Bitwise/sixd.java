package Bitwise;
//Program that check the
// MSB if it is 0 return 0 else 1
public class sixd {
    public static void main(String[] args) {
        int maskLSB;
        //Checked byte
        int x=0x011;
        //Set the MSB to 1 if it is 1 on that position- masked off
        x=x&0x00FF;
        //Shift the number with 8 bits to move the first 8 to the last 8
        x=(x>>8);


        for (int i = 0; i < 8 ; i++) {

            //Masked off the last bit
            maskLSB=(x>>i)&0x01;

            if(maskLSB==0){
                System.out.println(0);
                return;
            }

        }
        System.out.println(1);
    }
}
