package com.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual==null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoEsq(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo()+", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            exibirInOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo()+", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo()+", ");
            exibirInOrdem(atual.getNoEsq());
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void remover(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai =atual;
                if(conteudo.compareTo(atual.getConteudo())<0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }

            if(atual==null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }


        }catch(NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }
}
