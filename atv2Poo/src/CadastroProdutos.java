import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int nextId = 1;

    public void AdicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nextId, nome, preco);
        produtos.add(produto);
        nextId++;
    }


    public void ListarProdutos(){
        for (Produto p : produtos){
            System.out.println(p);
            String detalhes = p.MostrarDetalhes();
            System.out.println(detalhes);
        }
    }

  public Produto BuscarProdutos(int id){
        for (Produto p : produtos){
            if (p.getId() == id){
                return p;
            }
        }
        return null ;
  }
  public void AtualizarProduto(int id, String novoNome, double novoPreco) {
      for (Produto p : produtos) {
          if (p.getId() == id) {
              p.setNome(novoNome);
              p.setPreco(novoPreco);
              return ;

          }

      }

  }



}
