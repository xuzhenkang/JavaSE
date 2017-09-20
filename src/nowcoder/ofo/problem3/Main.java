package nowcoder.ofo.problem3;

import java.util.Scanner;

public class Main {
	static int[][] map = new int[210][210];
	static int[] numx = new int[100010];
	static int[] numy = new int[100010];
	static int[] ne = new int[100010];
	static int[] to = new int[100010];
	static int[] f = new int[100010];
	static int[] fir = new int[100010];
	static int[][] bel = new int[210][210];
	static boolean[] vis = new boolean[10010];
	static int tot, totx, cnt = 1;

	static void init(int m, int n) {
		int i, j;
		boolean flag;
		// scanf("%d%d",&m,&n);
		// for (i=1;i<=m;i++)
		// for (j=1;j<=n;j++)
		// scanf("%d",&map[i][j]);
		for (i = 1; i <= m; i++) {
			flag = true;
			for (j = 1; j <= n; j++)
				if (map[i][j] == 2)
					flag = true;
				else {
					if (flag) {
						totx++;
						numx[totx] = i;
					}
					bel[i][j] = totx;
					flag = false;
				}
		}
		tot = totx;
		for (j = 1; j <= n; j++) {
			flag = true;
			for (i = 1; i <= m; i++)
				if (map[i][j] == 2)
					flag = true;
				else {
					if (flag) {
						tot++;
						numy[tot] = j;
					}
					if (map[i][j] != 1) {
						add(tot, bel[i][j]);
						add(bel[i][j], tot);
					}
					flag = false;
				}
		}
	}

	static void add(int u, int v) {
		cnt++;
		ne[cnt] = fir[u];
		fir[u] = cnt;
		to[cnt] = v;
	}

	static boolean dfs(int u) {
		int i, v;
		for (i = fir[u]; i != 0; i = ne[i])
			if (!vis[v = to[i]]) {
				vis[v] = true;
				if (f[v] == 0 || dfs(f[v])) {
					f[u] = v;
					f[v] = u;
					return true;
				}
			}
		return false;
	}

	public static void main(String[] args) {
		int i, j, ans = 0;
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		for (i = 1; i <= m; i++)
			for (j = 1; j <= n; j++)
				map[i][j] = cin.nextInt();
		init(m, n);
		for (i = 1; i <= tot; i++)
			if (f[i] == 0) {
				for (j = 1; j <= tot; j++)
					vis[j] = false;
				if (dfs(i))
					ans++;
			}
		System.out.println(ans);
		cin.close();
	}
}
