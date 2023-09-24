package com.spring.FirstSpringPrj;

public class Phone {

		private String pBrand;
		private int pRam;
		private int pStorage;
		
		public Phone(String pBrand, int pRam, int pStorage) {
			this.pBrand = pBrand;
			this.pRam = pRam;
			this.pStorage = pStorage;
		}
		
		public String getpBrand() {
			return pBrand;
		}
		public void setpBrand(String pBrand) {
			this.pBrand = pBrand;
		}
		public int getpRam() {
			return pRam;
		}
		public void setpRam(int pRam) {
			this.pRam = pRam;
		}
		public int getpStorage() {
			return pStorage;
		}
		public void setpStorage(int pStorage) {
			this.pStorage = pStorage;
		}
		@Override
		public String toString() {
			return "Phone [pBrand=" + pBrand + ", pRam=" + pRam + ", pStorage=" + pStorage + "]";
		}
		
		
}
