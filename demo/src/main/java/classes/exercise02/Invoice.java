package classes.exercise02;

public class Invoice {
    private int itemFaturado;
    private String descricaoItem;
    private int quantidadeItem;
    private Double precoUnitario;

    public Invoice(int itemFaturado, String descricaoItem, int quantidadeItem, Double precoUnitario){
        this.itemFaturado = itemFaturado;
        this.descricaoItem = descricaoItem;
        this.quantidadeItem = quantidadeItem;
        this.precoUnitario = precoUnitario;

        if(this.quantidadeItem < 0){
            this.quantidadeItem = 0;
        }
        if(this.precoUnitario < 0){
            this.precoUnitario = 0.0;
        }

    }

    public void setItemFaturado(int itemFaturado){
        this.itemFaturado = itemFaturado;
    }

    public int getItemFaturado() {
        return itemFaturado;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Double getInvoiceAmount(){
        System.out.println((double) quantidadeItem * precoUnitario);
        return (double) quantidadeItem * precoUnitario;
    }
    
}
