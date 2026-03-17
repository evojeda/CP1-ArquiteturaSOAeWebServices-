package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Menu de Vinhos:\n"
                + "Touriga Nacional\n"
                + "Carménère\n"
                + "Tempranillo\n"
                + "Garnacha\n"
                + "Cabernet Sauvignon:\n"
                + "Alvarinho";
    }
    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}