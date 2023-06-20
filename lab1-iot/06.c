#include <stdio.h>
#include <stdlib.h>

struct arv {
  int info;
  struct arv* esq;
  struct arv* dir;
};

typedef struct arv Arv;

Arv* busca (Arv* r, int v)
{
  if (r == NULL) return NULL;
  else if (r->info > v) return busca(r->esq,v);
  else if (r->info < v) return busca(r->dir,v);
  else return r;
}


Arv* insere (Arv* a, int v)
{
  if (a==NULL) {
    a = (Arv*)malloc(sizeof(Arv));
    a->info = v;
    a->esq = a->dir = NULL;
  }
  else if (v < a->info)
    a->esq = insere(a->esq,v);
  else /* v < a->info */
    a->dir = insere(a->dir,v);
  return a;
}

int vazia(Arv* a)
{
  return a==NULL;
}

Arv* libera (Arv* a){
  if (!vazia(a)){
    libera(a->esq); /* libera sae */
    libera(a->dir); /* libera sad */
    free(a); /* libera raiz */
  }
  return NULL;
}


void imprime_in (Arv* r)
{
  if(r!=NULL){
    imprime_in(r->esq);
    printf("%d\n", r->info);
    imprime_in(r->dir);
  }
}



void main(void)
{
  Arv* a = NULL;
  a = insere(a, 1);
  printf("Arv:\n");
  imprime_in(a);

  a = insere(a, 2);
  printf("Arv:\n");
  imprime_in(a);

  a = insere(a, 3);
  printf("Arv:\n");
  imprime_in(a);

  a = insere(a, 5);
  printf("Arv:\n");
  imprime_in(a);

  a = insere(a, 15);
  printf("Arv:\n");
  imprime_in(a);

  a = insere(a, 7);
  printf("Arv:\n");
  imprime_in(a);

  printf("\nBuscas:\n");

  Arv* b = busca(a, 2);
  if(b==NULL){
    printf("Numero 2 nao esta na arvore!\n");
  }else{
    printf("Numero 2 esta na arvore!\n");
  }

  b = busca(a, 8);
  if(b==NULL){
    printf("Numero 8 nao esta na arvore!\n");
  }else{
    printf("Numero 8 esta na arvore!\n");
  }
}
