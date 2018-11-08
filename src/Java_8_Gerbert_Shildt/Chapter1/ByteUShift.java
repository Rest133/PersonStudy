package Java_8_Gerbert_Shildt.Chapter1;

 class ByteUShift {
    public static void main(String[] args) {
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        byte b = (byte) 0xf1; // = -15 // = 1111
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);

        System.out.println(" b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println(" b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println(" (b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);


        //Мой код

        byte bb = (byte) 0x01;// = 1
        byte cc = (byte) 0xf2;// = -14
        byte dd = (byte) 0xf0;// = -16
        byte ee = (byte) 0x07;// = 7
        //-----------------------------
        byte ff = (byte) 0xf32;// = 50
        byte gg = (byte) 0xf16;// = 22
        byte hh = (byte) 0xf9;// = -7
        byte jj = (byte) 0xf10;// = 16
        byte ii = (byte) 0x0f;// = 15 / F
        byte iii = (byte) 0x00f;// = 15 / F
        byte iv = (byte) 0xff;//= -1
        byte ivv = (byte) 0xf5;//= 5
        System.out.println("0x01 = " + hex[bb]);
        System.out.println("0x07 = " + hex[ee]);
        //System.out.println("0xf10 = " + hex[jj]);
        System.out.println("0x5 = " + hex[ivv]);
        //System.out.println("0xf32 = " + hex[ff]);
        //System.out.println("0xf1 = " + hex[b]);
        //System.out.println("0xf2 = " + hex[cc]);
        //System.out.println("0xf0 = " + hex[dd]);
    }
}
