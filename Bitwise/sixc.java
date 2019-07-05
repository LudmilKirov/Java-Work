package Bitwise;
//Program that check if the
// LSB is 1 if so return 1 else 0
public class sixc {
    public static void main(String[] args) {
        int maskLSB;
        //Checked byte
        int x=0xFF00;
        //Set the LSB to 1 if it is 1
        // on that position - masked off
        x=x&0x00FF;

        for (int i = 0; i < 8 ; i++) {

            //Masked off the last bit
            maskLSB=(x>>i)&0x01;

            if(maskLSB==1){
                System.out.println(1);
                return;
            }

        }
        System.out.println(0);
    }
}
