package edu.neu.mgen;


public class App 
{
    public static void main( String[] args )
    {
        String names[] = {"Anne","John","Alex","Jessica"};
        String tempString[] = new String[4];
        int length = names.length;
        App obj = new App();
        obj.reverseArray(names,tempString,length);
        obj.reverseCharactersOfEachArray(names,length);
        obj.printNames(names,length);
    }

    public void reverseArray(String names[], String tempString[],int length){ 
        int shortened = length / 2;
        for (int i=0; i<shortened; i++)
        {
            tempString[i]=names[i];
            tempString[i] = names[length-i-1];
            names[length-i-1] = tempString[i];
        }
    }

    public void reverseCharactersOfEachArray(String names[],int length){
        for (int i=0;i<length;i++)
        {
            String str= names[i].toLowerCase();
            int strLength = str.length();
            String nstr="";
            char ch;
            for (int j=strLength-1;j>=0;j--) {
                ch= str.charAt(j); 
                if(j==strLength-1)
                    ch=Character.toUpperCase(ch);
                nstr=  nstr + ch;
            }
            names[i]=nstr;
        }
    }
    public void printNames(String names[], int length){
        for (int i=0;i<length;i++)
        {
            System.out.println(names[i]);
        }
    }
}
