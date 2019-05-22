
public class Main {
	public static void main(String[] args) {
		new B(10);
}

	public static class A {
		private int i = 20;
		
			public A(int i) {
				System.out.println(" in A const i " + i);
				this.i = i;
				System.out.println(" after this.i = i; A const i " + i);
				initialize();
				System.out.println(" after initialize in A const i " + i);
			}
		
			protected void initialize() {
				System.out.println("in A initia method i = " + i);
			}
	}

	public static class B extends A {
		protected int i = 5;
	
		public B(int i) {
			
			super(i);
			System.out.println(" in B const i " + i);
			this.i += i;
			System.out.println(" after this.i += i; B const i " + i);
			initialize();
			System.out.println(" after initialize in B const i " + i);
		}

		protected void initialize() {
			System.out.println("in B initia method i = " + i);
		}
	}
}