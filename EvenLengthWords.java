public class EvenLengthWords {
    public static void main(String[] args) {
        {
            String s="Print words with even length";
            s=s+" ";
            StringBuilder sb=new StringBuilder();
            int count=0;
            
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)!=' ')
                    {
                        sb.append(s.charAt(j));
                        count++;
                    }
                    else{
                    if(count%2==0)
                    {
                        System.out.print(sb.toString()+" ");
                    }
                    sb=new StringBuilder();
                    count=0;
                }
            }
        }
        }
    }