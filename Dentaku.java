 class Dentaku{
  public static void main(String[] args){
    int val1 = 0;
    int val2 = 0;
    String ope;
    int kekka;

    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
    boolean errFlag = true;
    ope = args[1];

    if(args.length != 3){
      errDisp("������3���͂��Ă�������");
    }

    try{
      val1 = Integer.parseInt(args[0]);
      val2 = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
      errDisp("���l�łȂ��l�����͂���Ă��܂�");
    }

    for(int i = 0; i < 4; i++){
      if(ope.equals(opeStr[i])){
        errFlag = false;
      }
    }

    if(errFlag == true){
      errDisp("���Z�q�� kake waru tasu hiku ��4�ł�");
    }

    if(ope.equals("kake")){
      kekka = val1 * val2;
    }else if(ope.equals("tasu")){
      kekka = val1 + val2;
    }else if(ope.equals("hiku")){
      kekka = val1 - val2;
    }else{
      if(val2 == 0){
        errDisp("0 �Ŋ��낤�Ƃ��܂���");
      }
      kekka = val1 / val2;
    }

    System.out.println("���͂��ꂽ����" + val1 + " " + ope + " " + val2 + "�ł�");
    System.out.println("�v�Z���ʂ� " + kekka + " �ł�");
  }

  private static void errDisp(String errStr){
    System.out.println(errStr);
    System.out.println("Usage : java dentaku ���l�@���Z�q�@���l");
    System.exit(0);
  }
}
