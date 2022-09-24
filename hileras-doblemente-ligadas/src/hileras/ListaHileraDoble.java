package hileras;

public class ListaHileraDoble {
    private NodoDoble cab, ult, x;
    private String hilera;

    public ListaHileraDoble(String hilera)
    {
        this.hilera = hilera;
        cab = new NodoDoble('*');
        ult = cab;
        x = cab;
    }
    public void CrearHilera(char pCaracter)
    {
        NodoDoble p = new NodoDoble(pCaracter);
        ult.SetLigaDer(p);
        p.SetLigaIzq(ult);
        ult = p;
    }
    public void ListaHileraDoble()
    {
        NodoDoble p;
        int i;
        for(i=0; i<hilera.length();i++)
        {
            p= new NodoDoble(hilera.charAt(i));
            ult.SetLigaDer(p);
            p.SetLigaIzq(ult);
            ult=p;
        }

    }

    public char MostrarDatos()
    {
        x = x.GetLigaDer();
        if(x == null)
        {
            x = cab;
        }
        return x.GetCaracter();
    }

    public boolean eliminarPrimerAparicion(char pCaracter)
    {
        boolean elimino = false;
        NodoDoble p = cab.GetLigaDer();
        while (p != null)
        {
            if (p.GetCaracter() == pCaracter) {
                p.GetLigaIzq().SetLigaDer(p.GetLigaDer());
                p.GetLigaDer().SetLigaIzq(p.GetLigaIzq());
                elimino = true;
                p = null;
            } else {
                p = p.GetLigaDer();
            }

        }
        return elimino;
    }

    public void CambiarLetra(char pVocal)
    {
        NodoDoble p= cab.GetLigaDer();
        while(p != null)
        {
            if(p.GetCaracter()==pVocal)
            {
                p.SetCaracter('G');
            }
            p=p.GetLigaDer();
        }
    }

      public void cambiarCaracterPrimeraPalabra(char pVocal) {
          NodoDoble p = cab;
          boolean seguir = true;
          while (p.GetLigaDer() != null) {
              if (p.GetCaracter() == pVocal && seguir) {
                  p.SetCaracter('F');
              } else if (p.GetCaracter() == ' ') {
                  seguir = false;
              }
              p = p.GetLigaDer();
          }
      }
          public void cambiarLetraPrimeraPalabra ( char pVocal)
          {
              NodoDoble p = cab.GetLigaDer();
              int cont = 0;
              while (p != null) {
                  if (p.GetCaracter() != ' ') {
                      cont++;
                  }
                  if (p.GetCaracter() == pVocal && cont == 1) {
                      p.SetCaracter('M');
                  }
                  p = p.GetLigaDer();
              }
          }

          public int contarCaracter ( char pCar)
          {
              int contar = 0;
              NodoDoble p = cab.GetLigaDer();
              while (p != null) {
                  if (p.GetCaracter() == pCar) {
                      contar++;
                  }
                  p = p.GetLigaDer();
              }
              return contar;
          }
    public int contarOes()
    {
        NodoDoble p= cab.GetLigaDer();
        int contar=0, contaEspacio=0;
        while (p != null)
        {
            if  (p.GetCaracter() ==' ');
            {
                contaEspacio ++;
            }
                 if (contaEspacio==2 && p.GetCaracter()=='a')
                 {
                     contar ++;
                  }
            p = p.GetLigaDer();
        }
        return contar;
    }
/*revisar y refactorizar*/
    public void EliminaAes() // modifica el ultimo
    {
        NodoDoble p = ult.GetLigaIzq();

        if   ( p.GetCaracter()!='a')
        {
            p.SetCaracter ('A');
        }
   else
        {
            p.GetLigaIzq().SetLigaDer(p.GetLigaDer());
            p.GetLigaDer().SetLigaIzq(p.GetLigaIzq());
        }
    }

}

/*
    public int ReversarListaDoble()
    {
        z = z.getLigaIzq();
        if (z==null)
        {
            z=ult;
            return cab.getNumero();
        }
        else
        {
            return z.getLigaDer().getNumero();
        }
    }
    public int ContarImpares() {
        int contImp = 0;
        NodoDoble p = cab.getLigaDer();
        while (p != null) {
            if (p.getNumero() % 2 == 1)
                contImp++;
        }
        p = p.getLigaDer();
        return contImp;
    }

}*/




