import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

    }

                }
                class Stock{

                    public void showAll() throws IOException {
                        Document document = Jsoup.connect("https://stockanalysis.com/list/sp-500-stocks/").get();
                        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
                        System.out.println("\n Top 503 US Stocks By Market Cap: \n");
                        for (Element row: document.select("table.symbol-table.svelte-eurwtr tr")){
                            String Symbol = row.select(".svelte-eurwtr.sym").text();
                            if (!Symbol.equals("Symbol")){
                                String number = row.select(" td.svelte-eurwtr:nth-of-type(1)").text();
                                String CompName = row.select(".svelte-eurwtr.slw").text();
                                String MarketCap = row.select("td.svelte-eurwtr:nth-of-type(4)").text();
                                String StockPrice = row.select("td.svelte-eurwtr:nth-of-type(5)").text();
                                String Revenue = row.select(".svelte-eurwtr.tr").text();
                                String PercentageChange = row.select(".svelte-eurwtr.rg").text();
                                if (PercentageChange.isBlank()){
                                    PercentageChange = row.select(".svelte-eurwtr.rr").text(); }

                                System.out.println("No. " + number + " || Symbol: " + Symbol + " || Company Name: " + CompName + " || Stock Price: " + StockPrice + " || % Change: " + PercentageChange + " || Market Cap: " + MarketCap + " || Revenue: "+ Revenue);
                            }}
                        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
                    }

                    public void inquire() throws IOException {
                        Scanner scan = new Scanner(System.in);
                        Document document = Jsoup.connect("https://stockanalysis.com/list/sp-500-stocks/").get();
                        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
                        System.out.println("\nEnter the stock's ID: ");
                        String s = scan.nextLine();

                        for (Element row: document.select("table.symbol-table.svelte-eurwtr tr")){

                            String Symbol = row.select(".svelte-eurwtr.sym").text();
                            if (s.equalsIgnoreCase(Symbol)) {
                                String number = row.select(" td.svelte-eurwtr:nth-of-type(1)").text();
                                String CompName = row.select(".svelte-eurwtr.slw").text();
                                String MarketCap = row.select("td.svelte-eurwtr:nth-of-type(4)").text();
                                String StockPrice = row.select("td.svelte-eurwtr:nth-of-type(5)").text();
                                String Revenue = row.select(".svelte-eurwtr.tr").text();
                                String PercentageChange = row.select(".svelte-eurwtr.rg").text();
                                    if (PercentageChange.isBlank()){
                                        PercentageChange = row.select(".svelte-eurwtr.rr").text();
                                    }
                                System.out.println("No. " + number + " || Symbol: " + Symbol + " || Company Name: " + CompName + " || Stock Price: " + StockPrice + " || % Change: " + PercentageChange + " || Market Cap: " + MarketCap + " || Revenue: "+ Revenue);
                            }}
                        System.out.println("\n=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");

                    }











                }