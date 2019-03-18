package patterns.sdp.facade;

/* Complex parts */

class CPU {
	public void freeze() {
	}

	public void jump(long position) {
	}

	public void execute() {
	}
}

class HardDrive {
	public byte[] read(long lba, int size) {
		return new byte[0];
	}
}

class Memory {
	public void load(long position, byte[] data) {
	}
}

/* Facade */

class ComputerFacade {
	private CPU processor;
	private Memory ram;
	private HardDrive hd;

	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}

	public void start() {
		processor.freeze();
		ram.load(0, hd.read(0, 0));
		processor.jump(0);
		processor.execute();
	}
}

/* Client */

public class FacadePattern {
	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}
}
