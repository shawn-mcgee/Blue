package blue.geom;

public class Matrix4f extends Matrix<Vector4f> {
	private static final long
		serialVersionUID = 1L;
	
	protected final Vector4f.Mutable
		v0 = new Vector4f.Mutable(),
		v1 = new Vector4f.Mutable(),
		v2 = new Vector4f.Mutable(),
		v3 = new Vector4f.Mutable();
	
	public Matrix4f() {
		//do nothing
	}
	
	public Matrix4f(
			Matrix<?> m
			) {
		this.v0.set(m.row(0));
		this.v1.set(m.row(1));
		this.v2.set(m.row(2));
		this.v3.set(m.row(3));
	}
	
	public Matrix4f(
			Vector r0,
			Vector r1,
			Vector r2,
			Vector r3
			) {
		this.v0.set(r0);
		this.v1.set(r1);
		this.v2.set(r2);
		this.v3.set(r3);
	}
	
	public Matrix4f(
			float a, float b, float c, float d,
			float e, float f, float g, float h, 
			float i, float j, float k, float l,
			float m, float n, float o, float p
			) {
		this.v0.set(a, b, c, d);
		this.v1.set(e, f, g, h);
		this.v2.set(i, j, k, l);
		this.v3.set(m, n, o, p);
	}

	@Override
	public float get(int i, int j) {
		switch(i) {
			case 0: return v0.get(j);
			case 1: return v1.get(j);
			case 2: return v2.get(j);
			case 3: return v3.get(j);
		}
		return 0f;
	}

	@Override
	public Vector4f row(int i) {
		return new Vector4f(
				get(i, 0),
				get(i, 1),
				get(i, 2),
				get(i, 3)
				);
	}

	@Override
	public Vector4f col(int j) {
		return new Vector4f(
				get(0, j),
				get(1, j),
				get(2, j),
				get(3, j)
				);
	}
	
	@Override
	public int m() {
		return 4;
	}
	
	@Override
	public int n() {
		return 4;
	}

	@Override
	public Matrix4f copy() {
		return new Matrix4f(this);
	}
}
