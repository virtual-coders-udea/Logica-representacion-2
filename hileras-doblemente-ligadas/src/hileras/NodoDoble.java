/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hileras;

public class NodoDoble
{
    private char caracter;
    private NodoDoble ligaIzq, ligaDer;

    public NodoDoble(char pCaracter)
    {
        caracter = pCaracter;
        ligaIzq = ligaDer = null;
    }

    public char GetCaracter()
    {
        return caracter;
    }

    public void SetCaracter(char pCaracter)
    {
        caracter = pCaracter;
    }

    public void SetLigaIzq(NodoDoble pLigaIzq)
    {
        ligaIzq = pLigaIzq;
    }

    public void SetLigaDer(NodoDoble pLigaDer)
    {
        ligaDer = pLigaDer;
    }

    public NodoDoble GetLigaIzq()

    {  return ligaIzq; }

    public NodoDoble GetLigaDer()
    {
        return ligaDer;
    }
}
