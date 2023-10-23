```java
import java.util.*;

public class JavaExample {
public static void main(String[] args) {

        //OddorEven();
        //   boolean ispalin= PalindromeString("madam");
        //   if(ispalin)
        //   {
        //             System.out.println("palindrome");
        //   }else
        //   {
        //             System.out.println("not a palindrome");
        //   }

        //   boolean ispalin= PalindromeNumber(12321);
        //   if(ispalin)
        //   {
        //             System.out.println("palindrome");
        //   }else
        //   {
        //             System.out.println("not a palindrome");
        //   }

        //leafYear(2000);

        // for (int i=0;i<20;i++)
        // {
        //     if(isPrime(i))
        //     {
        //         System.out.println(""+i);
        //     }
        // }

        //int largenum=largestnumber(10,200,30);
        //System.out.println(largenum+"");



        // fibonaicOrdinary(10);

        // for(int i=0;i<10;i++)
        // {
        //     int ifb=fibonaicRecursion(i);
        //     System.out.println(""+ifb);

        // }


        // int fac=factorialOrdinary(5);
        // System.out.println(""+fac);


        // int facr=factorialRegression(5);
        // System.out.println(""+facr);


        //int[] dn= {10,20,30,30,40,60,40};
        //findDublicateInt(dn);

        // String mystr="Hi how are you you are";
        // findDublicateword(mystr);

        //int[] sarray={100,10,40,60,200};
        //sortArray(sarray);//selection sort


        // int[] larray={100,10,40,60,200};
        // int tl=lArray(larray);
        // System.out.println(""+tl);

        //int[] rarray={100,20,30,40,30,40};
        // removeDublicate(rarray);

        //int[] rearray={100,20,30,40,30,40};
        // reverseArray(rearray);

        // int[] eo={100,20,30,40,30,40};
        //EvenOdd(eo);

        //int[] a1= {10,20,30,40,50,60};
        //int[] a2= {20,40,90,100};
        //IntersectionFindCommon(a1,a2);

        // UnionRemoveDublicate(a1,a2);

        //int[] IntArray={10,20,30,60,70,80,70,10,10,10};
        //int mfelement=MostFrequentElemnt(IntArray);
        //System.out.println(mfelement+"");

        // String mystrfre="hi how are you you hi are bye are";
        // String[] mystrArray=mystrfre.split(" ");
        // String mystrfree=MostFrequentElemntString(mystrArray);
        // System.out.println(""+mystrfree);

        //String mystrfre2="hi how are you you hi are bye are";
        //char[] cArray=mystrfre2.replace(" ","").toCharArray();

        //System.out.println(""+MostFrequentChar(cArray));

        //int[] larrayelement={20,30,50,55,1};
        //int l=FindLargest(larrayelement);
        //System.out.println(""+l);

        //int[] zArray={10,20,0,35,0,70,0};
        //MoveAllZeroatFirst(zArray);
        // MoveAllZeroatLast(zArray);

        // int[] roArray= {20,30,50,55,1};
        //RoatationArray(roArray);

        // swafstring("hi","how");

        // String nvc="Hi I am i";
        // numberOfVowelsConsonents(nvc);

        // String rstr="Hi How Are You";
        //ReverseString(rstr);

        //String nchar="hi how are you";
        //numberofcharacter(nchar);

        //String cstr="abc";
        //CombinationStr(" ",cstr,0);

        //Permutation(" ",cstr);


        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(10);

        ALremoveDublicate(al);




    }



    public static void ALremoveDublicate(ArrayList<Integer> al) {
        for(int i=0; i<al.size(); i++) {

            for(int j=i+1; j<al.size(); j++) {
                if(al.get(i) == al.get(j)) {
                    al.remove(i);
                }
            }
        }

        for(int n:al) {
            System.out.println(n);
        }
    }


    public static void Permutation(String p,String cstr) {

        if(cstr.length()==0) {
            System.out.println(p.trim());
        }

        for(int i=0; i<cstr.length(); i++) {
            Permutation(p+cstr.charAt(i),cstr.substring(0,i) + cstr.substring(i+1));
        }
    }



    public static void CombinationStr(String estr,String cstr,int num) {
        for(int i=num; i<cstr.length(); i++) {

            //System.out.println(""+i);
            System.out.println((estr+cstr.charAt(i)).trim());
            CombinationStr(estr+cstr.charAt(i),cstr,i+1);
        }
    }


    public static void numberofcharacter(String nchar) {
        char[] ch=nchar.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i]!='h' && ch[i]!=' ') {
                count++;
            }
        }
        System.out.println(""+count);

    }

    public static void ReverseString(String rstr) {
        char[] ch=rstr.toCharArray();
        String myrev="";
        for(int i=ch.length-1; i>=0; i--) {
            myrev= myrev+rstr.charAt(i);
        }

        System.out.println(myrev);
    }



    public static void numberOfVowelsConsonents(String nvs) {
        String cstr="AEIOUaeiou";
        int c=0;
        int v=0;

        for(int i=0; i<nvs.length(); i++) {
            if(nvs.charAt(i) != ' ') {
                if(cstr.indexOf(nvs.charAt(i)) != -1) {
                    v++;
                } else {
                    c++;
                }
            }

        }

        System.out.println("consonents : "+c+" vowels : "+v);

    }



    public static void swafstring(String s11,String s22) {
        String s1=s11;
        String s2=s22;

        s1=s1+s2;
        s2=s1.substring(0,(s1.length() - s2.length()));
        s1=s1.substring(s2.length());

        System.out.println("s1: "+s1+" s2: "+s2);

    }


    public static void RoatationArray(int[] roArray) {
        int rc=2;
        int arraysize=roArray.length;
        int[] roatationarray=new int[arraysize];
        int ni=0;

        if(arraysize<rc) {
            rc=rc-arraysize;
        }


        for(int i=(arraysize-rc); i<arraysize; i++) {
            roatationarray[ni]=roArray[i];
            ni++;
        }

        for(int j=0; j<(arraysize-rc); j++) {
            roatationarray[ni]=roArray[j];
            ni++;
        }

        System.out.println(""+Arrays.toString(roatationarray));


    }



    public static void MoveAllZeroatLast(int[] zArray) {
        int alength=0;
        for(int i=0; i<zArray.length; i++) {
            if(zArray[i]!=0) {
                int temp=zArray[i];
                zArray[i]=zArray[alength];
                zArray[alength]=temp;
                alength++;
            }
        }
        System.out.println(""+Arrays.toString(zArray));

    }



    public static void MoveAllZeroatFirst(int[] zArray) {
        int alength=zArray.length-1;
        for(int i=zArray.length-1; i>=0; i--) {
            if(zArray[i]!=0) {
                int temp=zArray[i];
                zArray[i]=zArray[alength];
                zArray[alength]=temp;
                alength--;
            }
        }
        System.out.println(""+Arrays.toString(zArray));

    }



    public static int FindLargest(int[] larrayelement) {
        int lar=larrayelement[0];
        for(int i=0; i<larrayelement.length; i++) {
            if(larrayelement[i]>lar) {
                lar=larrayelement[i];
            }

        }
        return lar;


    }




    public static char MostFrequentChar(char[] cArray) {
        int mf=0;
        char mfe=' ';
        for(int i=0; i<cArray.length-1; i++) {
            int cf=1;
            for(int j=i+1; j<cArray.length; j++) {
                if(cArray[i]==(cArray[j])) {

                    cf++;

                }
            }

            if(mf<cf) {
                mf=cf;
                mfe=cArray[i];

            }
        }
        System.out.println(""+mf);
        return mfe;

    }







    public static String MostFrequentElemntString(String[] StrArray) {
        int mf=0;
        String mfe=" ";
        for(int i=0; i<StrArray.length-1; i++) {
            int cf=1;
            for(int j=i+1; j<StrArray.length; j++) {
                if(StrArray[i].equals(StrArray[j])) {

                    cf++;

                }
            }

            if(mf<cf) {
                mf=cf;
                mfe=StrArray[i];
            }
        }

        return mfe;

    }








    public static int MostFrequentElemnt(int[] IntArray) {
        int mf=0;
        int mfe=0;
        for(int i=0; i<IntArray.length-1; i++) {
            int cf=1;
            for(int j=i+1; j<IntArray.length; j++) {
                if(IntArray[i]==IntArray[j]) {
                    cf++;

                }
            }

            if(mf<cf) {
                mf=cf;
                mfe=IntArray[i];
            }
        }

        return mfe;

    }


    public static void UnionRemoveDublicate(int[] a1,int[] a2) {
        int totalarray=a1.length + a2.length;
        int[] newArray=new int[totalarray];
        int uasize=0;
        for(int i=0; i<a1.length; i++) {
            newArray[uasize] =a1[i];
            uasize++;
        }

        for(int j=0; j<a2.length; j++) {
            boolean isg=false;
            for(int k=0; k<newArray.length; k++) {
                if(newArray[k]==a2[j]) {
                    isg=true;
                    break;
                }
            }
            if(!isg) {
                newArray[uasize]=a2[j];
                uasize++;
            }
        }


        System.out.println(""+Arrays.toString(newArray));

    }





    public static void IntersectionFindCommon(int[] a1, int[] a2) {

        for(int i=0; i<a1.length-1; i++) {
            for(int j=0; j<a2.length-1; j++) {
                if(a1[i]==a2[j]) {
                    System.out.println(""+a1[i])  ;
                }
            }
        }

    }




    public static void EvenOdd(int[] eo) {
        for(int i=0; i<eo.length; i=i+2) { // int i=1 means odd
            System.out.println(""+eo[i]);
        }

    }



    public static void reverseArray(int[] rearray) {
        int left=0;
        int right=rearray.length-1;

        while(left<right) {
            int temp=rearray[left];
            rearray[left]=rearray[right];
            rearray[right]=temp;
            left++;
            right--;

        }
        System.out.println(""+Arrays.toString(rearray));

    }



    public static void removeDublicate(int[] rarray) {

        int unique=0;
        for(int i=0; i<rarray.length-1; i++) {
            boolean isdublicate=false;
            for(int j=i+1; j<rarray.length; j++) {
                if(rarray[i]==rarray[j]) {
                    isdublicate=true;
                    break;
                }
            }

            if(!isdublicate) {
                rarray[unique]=rarray[i];
                unique++;
            } else {
                rarray[unique]=0;
                unique++;
            }
        }

        for(int i=0; i<rarray.length; i++) {
            if(rarray[i] != 0) {
                System.out.println(""+rarray[i]);
            }
        }

        // System.out.println(""+Arrays.toString(rarray));

    }

    public static int lArray(int[] larray) {
        for(int i=0; i<larray.length-1; i++) {
            for(int j= i+1; j<larray.length; j++) {
                if(larray[i] < larray[j]) {

                    int temp=larray[i] ;
                    larray[i] =larray[j] ;
                    larray[j] =temp;
                }
            }
        }

        return larray[2] ;

    }





    public static void sortArray(int[] sarray) {
        for(int i=0; i<sarray.length-1; i++) {
            for(int j=i+1; j<sarray.length; j++) {
                if(sarray[i] < sarray[j]) {
                    int temp= sarray[i];
                    sarray[i]=sarray[j];
                    sarray[j]=temp;
                }
            }
        }

        System.out.println(""+Arrays.toString(sarray));

    }




    public static void findDublicateword(String mystr) {
        String[] mystrArray=mystr.split(" ");



        for(int i=0; i<mystrArray.length; i++) {
            int count=1;

            if(mystrArray[i] != null) {
                for(int j= i+1; j<mystrArray.length; j++) {
                    if(mystrArray[i].equals((mystrArray[j]))) {
                        mystrArray[j]=null;
                        count++;
                    }
                }
            }

            if(count>1) {
                System.out.println(mystrArray[i]);
            }




        }


    }









    public static void findDublicateInt(int[] dn) {

        for(int i=0; i<dn.length-1; i++) {
            int count=1;


            if( dn[i] != 0) {

                for(int j=i+1; j<dn.length; j++) {
                    if(dn[i] == dn[j]) {
                        dn[j]=0;
                        count++;

                    }
                }

            }


            if(count>1) {
                System.out.println(dn[i]);
            }


        }

    }




    public static int factorialRegression(int facr) {

        if(facr<=1) {
            return 1;
        }

        return facr * factorialRegression(facr-1);
    }



    public static int factorialOrdinary(int fac) {
        int total=1;


        for(int i=1; i<=fac; i++) {
            total  = total * i;

        }
        return total;

    }



    public static int fibonaicRecursion(int fb) {
        if(fb<=1) {
            return 1;
        }
        return fibonaicRecursion(fb-1) + fibonaicRecursion(fb-2);

    }




    public static void fibonaicOrdinary(int c) {
        int first=0;
        int second=1;

        System.out.println(""+first);
        System.out.println(""+second);

        for(int i=2; i<c; i++) {
            int combine=first + second;
            System.out.println(""+combine);

            first=second;
            second=combine;

        }

    }




    public static int largestnumber(int n1,int n2,int n3) {
        int largest =n1;
        if(n1>largest) {
            largest=n1;
        }
        if(n2>largest) {
            largest=n2;
        }

        return largest;

    }




    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }

        for(int i=2; i<n; i++) {
            if(n % i ==0) {
                return false;
            }

        }

        return true;

    }







    public static void leafYear(int n) {
        if((n % 4 == 0 && (n % 100) != 0) || (n % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("Not a leap year");
        }

    }




    public static boolean PalindromeNumber(int n) {
        int orginalnumber=n;
        int reversenumber=0;

        while(n!=0) {
            int digit= n %10;
            reversenumber= reversenumber * 10 + digit;
            n=n/10;

        }
        return (orginalnumber == reversenumber);

    }



    public static boolean PalindromeString(String str) {
        String mystr=str.toLowerCase();
        int left=0;
        int right=mystr.length()-1;

        while(left<right) {
            if(mystr.charAt(left) != mystr.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }

        return true;


    }



    public static void OddorEven() {
        int mynumber=10;
        if(mynumber % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

}

  ```