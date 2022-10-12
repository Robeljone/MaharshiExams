import javax.swing.plaf.synth.SynthLookAndFeel;

public class Main {

    //main method
    public  static  void  main(String[] argv)
    {
      int [] first = {3,3,4,4};

    }

    //remove duplicate item from array
    public static int[] remvDup(int [] a)
    {
        if (a==null || a.length==0)
        {
            return a;
        }
        else
        {
            int[] output = new int[a.length];
            int counter = 0;
            boolean isDup = false;
            for (int i=0;i<a.length;i++)
            {
                isDup = false;
                for (int j=0;j<output.length;j++)
                {
                    if (a[i]==output[j])
                    {
                        isDup = true;
                     break;
                    }
                }
               if (isDup == false)
               {
                   output[counter] = a[i];
                   counter++;
               }
            }
            if (counter==output.length)
            {
                return output;
            }
            else
            {
                int [] fileterdout = new int[counter];
                for (int x=0;x<fileterdout.length;x++)
                {
                    fileterdout[x] = output[x];
                }
                return fileterdout;
            }
        }
    }

    //revers given integer
    public static int revers(int num)
    {
        int sign = 1;
        int output = 0;
        if (num==0)
        {
            return num;
        }
        else if (num < 0)
        {
            sign = -1;
            num = (-1)*num;
        }
        while (num!=0)
        {
         output = (output * 10) + (num % 10);
         num = num /10;
        }
        return  sign*output;
    }

    //common array elements
    public static int[] commonArray(int []first , int[] second)
    {
        int [] output = {};
        if (first==null || second==null)
        {
            return null;
        } else if (first.length==0 || second.length==0)
        {
           return output;
        }
        else
        {
            int commonsize = 0;
            if(first.length>second.length)
            {
                commonsize = second.length;
            }
            else
            {
                commonsize = first.length;
            }
            int commonarray[] = new int[commonsize];
            int counter =0;
            for (int i=0;i<first.length;i++)
            {
                for (int j=0;j< second.length;j++)
                {
                    if (first[i]==second[j])
                    {
                      commonarray[counter] = first[i];
                      counter = counter +1;
                    }
                }
            }
            if (commonsize==commonarray.length)
            {
             return  commonarray;
            }
            else {
                int[] newcommon = new int[counter];
                for (int x = 0; x < newcommon.length; x++)
                {
                    newcommon[x] = commonarray[x];
                }
                return newcommon;
            }
        }
    }

    //find the sum of even and odd num in the array given
    //array should return value = odd - even
    public  static int sumOddEven(int []list)
    {
        int odd = 0;
        int even = 0;
        int sumOf = 0;
        if (list==null || list.length==0)
        {
            return 0;
        }
        else
        {
          for (int i=0;i<list.length;i++)
          {
              if (list[i]%2==0)
              {
                  even = even + list[i];
              }
              else
              {
                  odd = odd + list[i];
              }
          }
          sumOf = odd - even;
          return sumOf;
        }
    }

    //check if all array is divided by its divisor
    public static int checkDivide(int [] li,int divisor)
    {
        int counter =0;
        if (li == null || li.length==0)
        {
            return 0;
        }
        else
        {
            for (int i=0;i<li.length;i++)
            {
                if (li[i]%divisor==0)
                {
                    counter = counter+1;
                }
            }
            if (counter==li.length)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }

    //check reps equal between array and integer
    public  static int repsEqual(int []lists,  int num)
    {
        if (lists==null || lists.length==0)
        {
            return 0;
        }
        else
        {
            int counter = 0;
         for (int i=lists.length-1;i>=0;i--)
          {
                int digit = num % 10;
                num = num / 10;
                if (lists[i]==digit)
                {
                    counter = counter + 1;
                }
          }
         if (counter==lists.length)
            {
             return 1;
            }
         else
            {
             return 0;
            }
        }
    }

    //find the centerd element sum is 15


}
