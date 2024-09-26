public class parametroInvalidoException extends Exception{
        public parametroInvalidoException(){
            throw new ArithmeticException("valor 2 não pode ser maior que o valor 1");
        }
    }
