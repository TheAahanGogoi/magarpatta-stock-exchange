import java.util.*; 
class magarpattastockexchange
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in); 
        String username;
        int ch, amt = 0, bal = 10000,stock,newamt=0;
        boolean axisbank=false, reliance=false, hdfcbank=false, adaniports=false, icicibank=false, tatamotors=false, tcs=false, bajfinance=false, asianpaint=false, paytm=false;
        System.out.println("MAGARPATTA STOCK EXCHANGE (MSE)"); 
        System.out.println("Enter your name"); 
        username = sc.nextLine(); 
        System.out.println("Hello "+username+"! You have been given Rs.10,000 to start trading, keep checking your portfolio to view profit/loss"); 
        for ( ; ; )
        {
            System.out.println(" Enter 1 to view portfolio \n Enter 2 to view stock listings and trade \n Enter 3 to sell all holdings and end session");
            ch = sc.nextInt(); 
            if (amt>0)
                amt = (int) (Math.random()*((amt+500)-(amt-500)+1)+(amt-500));
            switch (ch)
            {
                case 1: 
                    System.out.println(username+"'s Portfolio \n INVESTMENT VALUE = Rs."+amt+"\n UNUSED FUNDS = Rs."+bal+"\n TOTAL = Rs."+(bal+amt));
                    System.out.println("Companies' shares owned by you:"); 
                    if (axisbank==true)
                        System.out.println("AXISBANK"); 
                    if (reliance==true)
                        System.out.println("RELIANCE"); 
                    if (hdfcbank==true)
                        System.out.println("HDFCBANK"); 
                    if (adaniports==true) 
                        System.out.println("ADANIPORTS");
                    if (icicibank==true)
                        System.out.println("ICICIBANK");
                    if (tatamotors==true)
                        System.out.println("TATAMOTORS");
                    if (tcs==true)
                        System.out.println("TCS"); 
                    if (bajfinance==true)
                        System.out.println("BAJFINANCE");
                    if (asianpaint==true)
                        System.out.println("ASIANPAINT"); 
                    if (paytm==true)
                        System.out.println("PAYTM"); 
                    break;
                case 2:
                    System.out.println("Stocks listed on MSE \n 1) AXISBANK - Rs.350 \n 2) RELIANCE - Rs.126 \n 3) HDFCBANK - Rs.893 \n 4) ADANIPORTS - Rs.420 \n 5) ICICIBANK - Rs.117 \n 6) TATAMOTORS - Rs.642 \n 7) TCS - Rs.685 \n 8) BAJFINANCE - Rs.189 \n 9) ASIANPAINT - Rs.690\n 10) PAYTM - Rs.101");
                    stock = sc.nextInt(); 
                    switch (stock)
                    {
                        case 1:
                            System.out.println("Enter quantity of shares"); 
                            int axisbankqty = sc.nextInt(); 
                            if (axisbankqty*350>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt=(axisbankqty*350); 
                                System.out.println("Shares worth Rs."+newamt+" have been purchased"); 
                                amt+=newamt; 
                                bal=bal-newamt;
                                axisbank=true;
                            }
                            break;
                        case 2:
                            System.out.println("Enter quantity of shares"); 
                            int relianceqty = sc.nextInt(); 
                            if (relianceqty*126>bal)
                                System.out.println("Insufficient funds"); 
                            else
                            {
                                newamt = (relianceqty*126);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt; 
                                bal=bal-newamt;
                                reliance=true;
                            }
                            break;
                        case 3:
                            System.out.println("Enter quantity of shares"); 
                            int hdfcbankqty = sc.nextInt(); 
                            if (hdfcbankqty*893>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt = (hdfcbankqty*893);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt;
                                bal=bal-newamt;
                                hdfcbank=true;
                            }
                            break;
                        case 4:
                            System.out.println("Enter quantity of shares"); 
                            int adaniportsqty = sc.nextInt(); 
                            if (adaniportsqty*420>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt = (adaniportsqty*420);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt;
                                bal=bal-newamt;
                                adaniports=true;
                            }
                            break;
                        case 5:
                            System.out.println("Enter quantity of shares"); 
                            int icicibankqty = sc.nextInt(); 
                            if (icicibankqty*117>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt = (icicibankqty*117);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt;
                                bal=bal-newamt;
                                icicibank=true;
                            }
                            break;
                        case 6:
                            System.out.println("Enter quantity of shares"); 
                            int tatamotorsqty = sc.nextInt(); 
                            if (tatamotorsqty*642>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt = (tatamotorsqty*642);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt;
                                bal=bal-newamt;
                                tatamotors=true;
                            }
                            break;
                        case 7:
                            System.out.println("Enter quantity of shares"); 
                            int tcsqty = sc.nextInt(); 
                            if (tcsqty*685>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt = (tcsqty*685);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt;
                                bal=bal-newamt;
                                tcs=true;
                            }
                            break;
                        case 8: 
                            System.out.println("Enter quantity of shares"); 
                            int bajfinanceqty = sc.nextInt(); 
                            if (bajfinanceqty*189>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt = (bajfinanceqty*189);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt;
                                bal=bal-newamt;
                                bajfinance=true;
                            }
                            break;
                        case 9:
                            System.out.println("Enter quantity of shares"); 
                            int asianpaintqty = sc.nextInt(); 
                            if (asianpaintqty*690>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt = (asianpaintqty*690);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt;
                                bal=bal-newamt;
                                asianpaint=true;
                            }
                            break;
                        case 10:
                            System.out.println("Enter quantity of shares"); 
                            int paytmqty = sc.nextInt(); 
                            if (paytmqty*101>bal)
                                System.out.println("Insufficient funds"); 
                            else 
                            {
                                newamt = (paytmqty*101);
                                System.out.println("Shares worth Rs."+newamt+" have been purchased");
                                amt+=newamt;
                                bal=bal-newamt;
                                paytm=true;
                            }
                            break;
                        default:
                            System.out.println("Invalid choice"); 
                    }
                    break;
                    case 3:
                        System.out.println("All your holdings have been sold, you started with Rs.10,000, you are now at Rs."+(bal+amt));
                        break;
                    default:
                        System.out.println("Invalid choice");
            }
            if (ch==3)
             break;
        }
    }
}
