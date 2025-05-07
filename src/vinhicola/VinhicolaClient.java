package vinhicola;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class VinhicolaClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://127.0.0.1:9876/vinhicola?wsdl");
        QName qName = new QName("http://vinhicola/", "VinhicolaServerImplService");
        Service ws = Service.create(url, qName);
        VinhicolaServer vinhicolaServer = ws.getPort(VinhicolaServer.class);
        System.out.print("Produto Cadastrado: " + vinhicolaServer.cadastrarVinho(1L, "Vinho Teste", 70.00F));
        System.out.print("Produto Pesquisado: " + vinhicolaServer.pesquisarPreco("Vinho1"));
    }
}
