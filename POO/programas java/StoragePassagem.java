package passagemaerea;

public class StoragePassagem{

    private Passageiro vPassageiro = new Passageiro();
    private Passagem vPassagem = new Passagem();
    private Pagamento vPagamento = new Pagamento();
    private Eticket vEticket = new Eticket();
    Leitura l = new Leitura(); 
    
    public Passageiro nPassageiro[];
    public Passagem nPassagem[];
    public Pagamento nPagamento[];
    public Eticket nEticket[];

    public int getNPassageiro(){
        int size = nPassageiro.length;
        return size;
    }
    public int getNPassagem(){
        int size = nPassagem.length;
        return size;
    }
    public int getNPagamento(){
        int size = nPagamento.length;
        return size;
    }
    public int getNEticket(){
        int size = nEticket.length;
        return size;
    }

//------------------------------------------Inserir -------------------------------------------------------------
    public void insPassageiro(Passageiro passageiro[]){
        for (int i = 0; i < 5; i ++) {
            if(nPassageiro[i] == nPassageiro[5]){
                System.out.println("O numero limite utrapassou o permitido. Altere ou Exclua");
            } else{
                System.out.println("Dados de Passageiro"+ (nPassageiro[i])+ " de 6");
    
                passageiro[i].setNome(l.inDados("\n Informe o Nome Completo: "));
                passageiro[i].setTelefone(Integer.parseInt(l.inDados("\n Informe o numero do Telefone:")));
                passageiro[i].setEmail(l.inDados("\n Informe o Email:"));
                passageiro[i].setEndereco(l.inDados("\n Informe o Endereco:"));
                passageiro[i].getFisica().setCpf(Integer.parseInt(l.inDados("\n Informe o CPF:")));
                passageiro[i].getJuridica().setCnpj(Integer.parseInt(l.inDados("\n Informe o CNPJ:")));
            }
    }
    }
    public void insPassagem(Passagem Passagem[]){
        for (int i = 0; i < 5; i ++) {
            if(nPassagem[i] == nPassagem[5]){
                 System.out.println("Dados de Passagem"+ (nPassagem[i]) + " de 16");
            }else{
    
                Passagem[i].setCodigo(Integer.parseInt(l.inDados("\n Informe o Codigo: ")));
                Passagem[i].setPreco(Integer.parseInt(l.inDados("\n Informe o Preco:")));
                Passagem[i].getData().setDia(Integer.parseInt(l.inDados("\n Informe o Dia:")));
                Passagem[i].getData().setMes(Integer.parseInt(l.inDados("\n Informe o Mes:")));
                Passagem[i].getData().setAno(Integer.parseInt(l.inDados("\n Informe o Ano:")));
                Passagem[i].getHorario().setHoras(Integer.parseInt(l.inDados("Informe a Hora:")));
                Passagem[i].getHorario().setMinutos(Integer.parseInt(l.inDados("\n Informe o Minuto:")));
                Passagem[i].getDestino().setCidade(l.inDados("\n Informe a Cidade:"));
                Passagem[i].getDestino().setEstado(l.inDados("\n Informe o Estado:"));
                Passagem[i].getDestino().setPais(l.inDados("\n Informe o Pais:"));
                Passagem[i].getOrigem().setCidade(l.inDados("\n Informe a Cidade:"));
                Passagem[i].getOrigem().setEstado(l.inDados("\n Informe o Estado:"));
                Passagem[i].getOrigem().setPais(l.inDados("\n Informe o Pais:"));        
                Passagem[i].getClasse().setEconomica(l.inDados("\n Economica:"));
                Passagem[i].getClasse().setExecutiva(l.inDados("\n Executiva:"));
            }
    }
    }

    public void insPagamento(Pagamento pagamento[]){
        for (int i = 0; i < 5; i ++) {
            if(nPagamento[i] == nPagamento[5]){
                System.out.println("O numero limite utrapassou o permitido. Altere ou Exclua");
            } else{
                System.out.println("Dados de Pagamento"+ (nPassagem[i]) + " de 13");
    
                pagamento[i].setDesconto(Integer.parseInt(l.inDados("\n Informe o Desconto")));
                pagamento[i].getCredito().setNumero(Integer.parseInt(l.inDados("\n Informe o numero do cartao:")));
                pagamento[i].getCredito().setNome(l.inDados("\n Informe o nome:"));
                pagamento[i].getCredito().setVencimento(Integer.parseInt(l.inDados("\n Informe a data de Vencimento:")));
                pagamento[i].getCredito().setBandeira(l.inDados("\n Informe a Bandeira:"));  
                pagamento[i].getDebito().setNumero(Integer.parseInt(l.inDados("\n Informe o numero do cartao:")));
                pagamento[i].getDebito().setNome(l.inDados("\n Informe o nome:"));
                pagamento[i].getDebito().setVencimento(Integer.parseInt(l.inDados("\n Informe a data de Vencimento:")));
                pagamento[i].getDebito().setBandeira(l.inDados("\n Informe a Bandeira:"));
                pagamento[i].getTransferencia().setConta(Integer.parseInt(l.inDados("\n Informe a Conta:")));
                pagamento[i].getTransferencia().setAgencia(Integer.parseInt(l.inDados("\n Informe a Agencia:")));
                pagamento[i].getTransferencia().setBanco(Integer.parseInt(l.inDados("\n Informe o Banco:")));
                pagamento[i].getTransferencia().setFavorecido(l.inDados("\n Informe o Favorecido:"));
            }
    }
    }

    public void insEticket(Eticket eticket){
        for (int i = 0; i < 5; i ++) {
            if(nEticket[i] == nEticket[5]){
                System.out.println("O numero limite utrapassou o permitido. Altere ou Exclua");
            }else{
                 System.out.println("Dados de Eticket "+ (nEticket[i]) + " de 2");
                 eticket.setLocalizador(Integer.parseInt(l.inDados("Informe o Localizador: ")));
                 eticket.setCodigoBarras(Integer.parseInt(l.inDados("\n Informe o Codigo de Barras:")));
            }
    }
    }
//-------------------------------------------Consultar ----------------------------------------------------------
    public void consPassageiro(String nome){
        for(int i = 0; i < 5; i++){
            if(nPassageiro[i].getNome()==nome){
                System.out.println("\n Passageiro encontrado.\n");
            }
            System.out.println("......Dados do Passageiro....."+ (nPassageiro[i])+ " de 6");

            System.out.println("\n Nome.: "+ nPassageiro[i].getNome());
            System.out.println("\n Telefone.:"+ nPassageiro[i].getTelefone());
            System.out.println("\n Email.:"+ nPassageiro[i].getEmail());
            System.out.println("\n Endereco.:"+ nPassageiro[i].getEndereco());
            System.out.println("\n Cpf.:"+ nPassageiro[i].getFisica().getCpf());
            System.out.println("\n Cnpj.:" + nPassageiro[i].getJuridica().getCnpj());
            return;
        }
         System.out.println("\n Passageiro nao encontrado. \n");
         return;
    }
    
    public void consPassagem(int cpf){
        for(int i = 0; i < nPassageiro.length; i++){
            if(nPassageiro[i].getFisica().getCpf() == cpf){
                System.out.println("\n Passagem encontrada. \n");
            }
            System.out.println("......Dados da Passagem Aerea..."+ (nPassagem[i])+ " de 16");

            System.out.println("\n Codigo.: " + nPassagem[i].getCodigo());
            System.out.println("\n Preco.: "+ nPassagem[i].getPreco());
            System.out.println("\n Dia.: "+ nPassagem[i].getData().getDia());
            System.out.println("\n Mes.: "+ nPassagem[i].getData().getMes());
            System.out.println("\n Ano.: "+ nPassagem[i].getData().getAno());
            System.out.println("\n Horas.:"+ nPassagem[i].getHorario().getHoras());
            System.out.println("\n Minutos.:"+ nPassagem[i].getHorario().getMinutos());
            System.out.println("\n Cidade.: "+ nPassagem[i].getDestino().getCidade());
            System.out.println("\n Estado.:"+ nPassagem[i].getDestino().getEstado());
            System.out.println("\n Pais.: "+ nPassagem[i].getDestino().getPais());
            System.out.println("\n Cidade.: "+ nPassagem[i].getOrigem().getCidade());
            System.out.println("\n Estado.:"+ nPassagem[i].getOrigem().getEstado());
            System.out.println("\n Pais.: "+ nPassagem[i].getOrigem().getPais());
            System.out.println("\n Economica.:"+ nPassagem[i].getClasse().getEconomica());
            System.out.println("\n Executiva.:"+ nPassagem[i].getClasse().getExecutiva());
        }
         System.out.println("\n Passagem nao encontrada. \n");
         return;
    }

    public void consPagamento(String nome){
        for(int i = 0; i < nPassageiro.length; i++){
            if(nPassageiro[i].getNome() == nome){
                System.out.println("\n Pagamento realizado. \n");
            }
             System.out.println("......Dados do Pagamento..."+ (nPagamento[i])+ " de 13");

             System.out.println("\n Desconto.:"+ nPagamento[i].getDesconto());
             System.out.println("\n Numero.:"+ nPagamento[i].getCredito().getNumero());
             System.out.println("\n Nome.:"+ nPagamento[i].getCredito().getNome());
             System.out.println("\n Vencimento.:"+ nPagamento[i].getCredito().getVencimento());
             System.out.println("\n Bandeira.:"+ nPagamento[i].getCredito().getBandeira());
             System.out.println("\n Numero.:"+ nPagamento[i].getDebito().getNumero());
             System.out.println("\n Nome.:"+ nPagamento[i].getDebito().getNome());
             System.out.println("\n Vencimento.:"+ nPagamento[i].getDebito().getVencimento());
             System.out.println("\n Bandeira.:"+ nPagamento[i].getDebito().getBandeira());
             System.out.println("\n Conta.:"+ nPagamento[i].getTransferencia().getConta());
             System.out.println("\n Agencia.:"+ nPagamento[i].getTransferencia().getAgencia());
             System.out.println("\n Banco.:"+ nPagamento[i].getTransferencia().getBanco());
             System.out.println("\n Favorecido.:"+ nPagamento[i].getTransferencia().getFavorecido());
             return;
        }
         System.out.println("\n Pagamento nao encontrado. \n");
         return;
    }

    public void consEticket(String nome){
        for(int i = 0; i < nEticket.length; i++){
            if(nPassageiro[i].getNome() == nome){
                 System.out.println("\n Eticket Gerado. \n");
            }
            System.out.println("......Dados do Eticket..."+ (nEticket[i])+ " de 2");

            System.out.println("\n Localizador.: "+ nEticket[i].getLocalizador());
            System.out.println("\n Codigo de Barras.:"+ nEticket[i].getCodigoBarras());
            return;
        }
        System.out.println("\n Eticket nao encontrado. \n");
         return;
    }

//-----------------------------------------Alterar ----------------------------------------------------
    public void alteraPassageiro(String nome){
        for(int i=0; i < nPassageiro.length;i++){
            if(nPassageiro[i].getNome()== nome){
                nPassageiro[i].setNome(l.inDados("\n Informe o Nome.:"));
                nPassageiro[i].setTelefone(Integer.parseInt(l.inDados("\n Informe o Telefone.:")));
                nPassageiro[i].setEmail(l.inDados("\n Informe o Email.:"));
                nPassageiro[i].getFisica().setCpf(Integer.parseInt(l.inDados("\n Informe o CPF.:")));
                nPassageiro[i].getJuridica().setCnpj(Integer.parseInt(l.inDados("Informe o CNPJ.:")));
                return;
            }
            System.out.println("Passageiro nao encontrado.");
            return;
        }
    }

    public void alteraPassagem(int cpf){
        for(int i = 0; i < nPassageiro.length; i++){
            if(nPassageiro[i].getFisica().getCpf()== cpf){
                nPassagem[i].setCodigo(Integer.parseInt(l.inDados("\n Informe o codigo.:")));
                nPassagem[i].setPreco(Integer.parseInt(l.inDados("\n Informe o Preco.:")));
                nPassagem[i].getData().setDia(Integer.parseInt(l.inDados("\n Informe o Dia.:")));
                nPassagem[i].getData().setMes(Integer.parseInt(l.inDados("\n Informe o Mes.:")));
                nPassagem[i].getData().setAno(Integer.parseInt(l.inDados("\n Informe o Ano.:")));
                nPassagem[i].getHorario().setHoras(Integer.parseInt(l.inDados("\n Informe a Hora.:")));
                nPassagem[i].getHorario().setMinutos(Integer.parseInt(l.inDados("\n Informe o Minulto.:")));
                nPassagem[i].getDestino().setCidade(l.inDados("\n Informe a Cidade.:"));
                nPassagem[i].getDestino().setEstado(l.inDados("\n Informe o Estado.:"));
                nPassagem[i].getDestino().setPais(l.inDados("\n Informe o Pais.:"));
                nPassagem[i].getOrigem().setCidade(l.inDados("\n Informe a Cidade.:"));
                nPassagem[i].getOrigem().setEstado(l.inDados("\n Informe o Estado.:"));
                nPassagem[i].getOrigem().setPais(l.inDados("\n Informe o Pais.:"));
                nPassagem[i].getClasse().setEconomica(l.inDados("\n  Ecnomica.: "));
            }
        System.out.println("Passagem nao encontrado.");
        }
    }    

    public void alteraPagamento(String nome){
        for(int i = 0; i < nPassageiro.length; i++){
            if(nPassageiro[i].getNome()== nome){
                nPagamento[i].setDesconto(Integer.parseInt(l.inDados("\n Informe o Desconto.:")));
                nPagamento[i].getCredito().setNumero(Integer.parseInt(l.inDados("\n Informe o Numero.:")));
                nPagamento[i].getCredito().setNome(l.inDados("\n Informe o Nome.:"));
                nPagamento[i].getCredito().setVencimento(Integer.parseInt(l.inDados("\n Informe o vencimento.:")));
                nPagamento[i].getCredito().setBandeira(l.inDados("\n Informe a Bandeira.:"));
                nPagamento[i].getDebito().setNumero(Integer.parseInt(l.inDados("\n Informe o Numero.:")));
                nPagamento[i].getDebito().setNome(l.inDados("\n Informe o Nome.:"));
                nPagamento[i].getDebito().setVencimento(Integer.parseInt(l.inDados("\n Informe o vencimento.:")));
                nPagamento[i].getDebito().setBandeira(l.inDados("\n Informe a Bandeira.:"));
                nPagamento[i].getTransferencia().setConta(Integer.parseInt(l.inDados("\n Informe a Conta.:")));
                nPagamento[i].getTransferencia().setAgencia(Integer.parseInt(l.inDados("\n Informe a Agencia.:")));
                nPagamento[i].getTransferencia().setBanco(Integer.parseInt(l.inDados("\n Informe o Banco.:")));
                nPagamento[i].getTransferencia().setFavorecido(l.inDados("\n Informe o Favorecido.:"));
            }
        System.out.println("Pagamento nao encontrado.");
        }
    }    

    public void alteraEticket(String nome){
        for(int i = 0; i < nPassageiro.length; i++){
            if(nPassageiro[i].getNome()== nome){
                nEticket[i].setLocalizador(Integer.parseInt(l.inDados("\n Informe o Localizador.:")));
                nEticket[i].setCodigoBarras(Integer.parseInt(l.inDados("\n Informe o Codigo de Barras.:")));
            }
             System.out.println("Eticket nao encontrado.");
        }
    }

//----------------------------------------------Excluir---------------------------------------------------
    public void excluirPassageiro(String nome){
        for(int i = 0; i < nPassageiro.length; i++){
           if(nPassageiro[i].getNome()== nome){
               for(int k = i; k < nPassageiro.length; k++){
                   if(k == ( nPassageiro.length)){
                       break;
                   }else{
                       nPassageiro[k].setNome(nPassageiro[k+1].getNome());
                       nPassageiro[k].setTelefone(nPassageiro[k+1].getTelefone());
                       nPassageiro[k].setEmail(nPassageiro[k+1].getEmail());
                       nPassageiro[k].getFisica().setCpf(nPassageiro[k+1].getFisica().getCpf());
                       nPassageiro[k].getJuridica().setCnpj(nPassageiro[k+1].getJuridica().getCnpj());

                       System.out.println("Passageiro excluido.");
                   }
               }
          }
        }
    }

    public void excluirPassagem(int cpf){
         for(int i = 0; i < nPassageiro.length; i++){
             if(nPassageiro[i].getFisica().getCpf() == cpf){
                  for(int k = i; k < nPassagem.length; k++){
                      if(k==(nPassagem.length)){
                          break;
                      }else{
                         nPassagem[k].setCodigo(nPassagem[k+1].getCodigo());
                         nPassagem[k].setPreco(nPassagem[k+1].getPreco());
                         nPassagem[k].getData().setDia(nPassagem[k+1].getData().getDia());
                         nPassagem[k].getData().setMes(nPassagem[k+1].getData().getMes());
                         nPassagem[k].getData().setAno(nPassagem[k+1].getData().getAno());
                         nPassagem[k].getHorario().setHoras(nPassagem[k+1].getHorario().getHoras());
                         nPassagem[k].getHorario().setMinutos(nPassagem[k+1].getHorario().getMinutos());
                         nPassagem[k].getDestino().setCidade(nPassagem[k+1].getDestino().getCidade());
                         nPassagem[k].getDestino().setEstado(nPassagem[k+1].getDestino().getEstado());
                         nPassagem[k].getDestino().setPais(nPassagem[k+1].getDestino().getPais());
                         nPassagem[k].getOrigem().setCidade(nPassagem[k+1].getDestino().getCidade());
                         nPassagem[k].getOrigem().setEstado(nPassagem[k+1].getDestino().getEstado());
                         nPassagem[k].getOrigem().setPais(nPassagem[k+1].getDestino().getPais());
                         nPassagem[k].getClasse().setEconomica(nPassagem[k+1].getClasse().getEconomica());
                         nPassagem[k].getClasse().setExecutiva(nPassagem[k+1].getClasse().getExecutiva());
                         
                         System.out.println("Passagem excluida.");
                     }
                  }
             }
         }
    }

    public void excluirPagamento(int cpf){
        for(int i = 0; i < nPassageiro.length; i++){
             if(nPassageiro[i].getFisica().getCpf() == cpf){
                  for(int k = i; i < nPagamento.length; i++){
                   if(i==(nPagamento.length - 1)){
                       break;
                    }else{
                       nPagamento[k].setDesconto(nPagamento[k+1].getDesconto());
                       nPagamento[k].getCredito().setNumero(nPagamento[k+1].getCredito().getNumero());
                       nPagamento[k].getCredito().setNome(nPagamento[k+1].getCredito().getNome());
                       nPagamento[k].getCredito().setVencimento(nPagamento[k+1].getCredito().getVencimento());
                       nPagamento[k].getCredito().setBandeira(nPagamento[k+1].getCredito().getBandeira());
                       nPagamento[k].getDebito().setNumero(nPagamento[k+1].getDebito().getNumero());
                       nPagamento[k].getDebito().setNome(nPagamento[k+1].getDebito().getNome());
                       nPagamento[k].getDebito().setVencimento(nPagamento[k+1].getDebito().getVencimento());
                       nPagamento[k].getDebito().setBandeira(nPagamento[k+1].getDebito().getBandeira());
                       nPagamento[k].getTransferencia().setConta(nPagamento[k+1].getTransferencia().getConta());
                       nPagamento[k].getTransferencia().setAgencia(nPagamento[k+1].getTransferencia().getAgencia());
                       nPagamento[k].getTransferencia().setBanco(nPagamento[k+1].getTransferencia().getBanco());
                       nPagamento[k].getTransferencia().setFavorecido(nPagamento[k+1].getTransferencia().getFavorecido());
                     }        
                 }      
             }
             System.out.println("Passagem encontrada.");
            return;   
        }
    }

    public void excluirEtcket(String nome){
          for(int i = 0; i < nEticket.length; i++){
             if(nEticket[i].getPassageiro().getFisica().getCpf() == cpf){
                  for(int k = i; i<nEticket.length; i++){
                   if(i == (nEticket.length - 1)){
                       break;
                    }else{
                        nEticket[i].setLocalizador(nEticket[i+1].getLocalizador());
                        nEticket[i].setCodigoBarras(nEticket[i+1].getCodigoBarras());
                    }
                }
                nEticket--;
                return;
            }     
            System.out.println("Eticket encontrado");
            return;
        }
    }           

}
