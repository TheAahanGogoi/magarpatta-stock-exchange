import java.util.*; 
class magarpattastockexchange
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in); 
        String username;
        int ch, amt = 0, bal = 10000,stock,newamt=0;
        char buysell='0';
        int axisbankqty=0, relianceqty=0, hdfcbankqty=0, adaniportsqty=0, icicibankqty=0, tatamotorsqty=0, tcsqty=0, bajfinanceqty=0, asianpaintqty=0, paytmqty=0;
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
                amt = (int) (Math.random()*((amt+500)-(amt-250)+1)+(amt-250));
            switch (ch)
            {
                case 1: 
                System.out.println(username+"'s Portfolio \n INVESTMENT VALUE = Rs."+amt+"\n UNUSED FUNDS = Rs."+bal+"\n TOTAL = Rs."+(bal+amt)+"\n PROFIT = Rs."+((bal+amt)-10000));
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
                System.out.println("Enter B to buy, enter S to sell"); 
                buysell = sc.next().charAt(0);
                if (buysell=='B' ||  buysell=='b')
                {
                    switch (stock)
                    {
                        case 1:
                        System.out.println("Enter quantity of shares"); 
                        axisbankqty = sc.nextInt(); 
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
                        relianceqty = sc.nextInt(); 
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
                        hdfcbankqty = sc.nextInt(); 
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
                        adaniportsqty = sc.nextInt(); 
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
                        icicibankqty = sc.nextInt(); 
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
                        tatamotorsqty = sc.nextInt(); 
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
                        tcsqty = sc.nextInt(); 
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
                        bajfinanceqty = sc.nextInt(); 
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
                        asianpaintqty = sc.nextInt(); 
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
                        paytmqty = sc.nextInt(); 
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
                }
                else if (buysell=='s'||buysell=='S')
                {
                    switch (stock)
                    {
                        case 1:
                        if (axisbank==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int sellaxisbankqty = sc.nextInt();
                            if (sellaxisbankqty<=axisbankqty)
                            {
                                newamt=(sellaxisbankqty*350);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                axisbankqty=axisbankqty-sellaxisbankqty;
                                if (axisbankqty>0)
                                    axisbank=true;
                                else
                                    axisbank=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 2:
                        if (reliance==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int sellrelianceqty = sc.nextInt();
                            if (sellrelianceqty<=relianceqty)
                            {
                                newamt=(sellrelianceqty*126);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                relianceqty=relianceqty-sellrelianceqty;
                                if (relianceqty>0)
                                    reliance=true;
                                else
                                    reliance=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 3:
                        if (hdfcbank==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int sellhdfcbankqty= sc.nextInt();
                            if (sellhdfcbankqty<=hdfcbankqty)
                            {
                                newamt=(sellhdfcbankqty*893);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                hdfcbankqty=hdfcbankqty-hdfcbankqty;
                                if (hdfcbankqty>0)
                                    hdfcbank=true;
                                else
                                    hdfcbank=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 4:
                        if (adaniports==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int selladaniportsqty = sc.nextInt();
                            if (selladaniportsqty<=adaniportsqty)
                            {
                                newamt=(selladaniportsqty*420);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                adaniportsqty=adaniportsqty-selladaniportsqty;
                                if (adaniportsqty>0)
                                    adaniports=true;
                                else
                                    adaniports=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 5:
                        if (icicibank==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int sellicicibankqty = sc.nextInt();
                            if (sellicicibankqty<=icicibankqty)
                            {
                                newamt=(sellicicibankqty*117);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                icicibankqty=icicibankqty-sellicicibankqty;
                                if (icicibankqty>0)
                                    icicibank=true;
                                else
                                    icicibank=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 6:
                        if (tatamotors==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int selltatamotorsqty = sc.nextInt();
                            if (selltatamotorsqty<=tatamotorsqty)
                            {
                                newamt=(selltatamotorsqty*642);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                tatamotorsqty=tatamotorsqty-selltatamotorsqty;
                                if (selltatamotorsqty>0)
                                    tatamotors=true;
                                else
                                    tatamotors=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 7:
                        if (tcs==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int selltcsqty = sc.nextInt();
                            if (selltcsqty<=tcsqty)
                            {
                                newamt=(selltcsqty*685);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                tcsqty=tcsqty-selltcsqty;
                                if (tcsqty>0)
                                    tcs=true;
                                else
                                    tcs=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 8:
                        if (bajfinance==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int sellbajfinanceqty = sc.nextInt();
                            if (sellbajfinanceqty<=bajfinanceqty)
                            {
                                newamt=(sellbajfinanceqty*189);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                bajfinanceqty=bajfinanceqty-sellbajfinanceqty;
                                if (bajfinanceqty>0)
                                    bajfinance=true;
                                else
                                    bajfinance=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 9:
                        if (asianpaint==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int sellasianpaintqty = sc.nextInt();
                            if (sellasianpaintqty<=asianpaintqty)
                            {
                                newamt=(sellasianpaintqty*690);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                asianpaintqty=asianpaintqty-sellasianpaintqty;
                                if (asianpaintqty>0)
                                    asianpaint=true;
                                else
                                    asianpaint=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                        case 10:
                        if (paytm==false)
                            System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                        else 
                        {
                            System.out.println("Enter quantity of shares to be sold");
                            int sellpaytmqty = sc.nextInt();
                            if (sellpaytmqty<=paytmqty)
                            {
                                newamt=(sellpaytmqty*101);
                                System.out.println("Shares worth Rs."+newamt+" have been sold");
                                amt-=newamt;
                                bal=bal+newamt;
                                paytmqty=paytmqty-sellpaytmqty;
                                if (paytmqty>0)
                                    paytm=true;
                                else
                                    paytm=false;
                            }                            
                            else
                            {
                                System.out.println("You cannot sell shares you do not own, short selling is prohibited by SEBI");
                            }     
                        }
                        break;
                    }
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

