package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_17478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		print(num, "");
	}
	public static void print(int n, String prefix) {
		System.out.println(prefix + "\"����Լ��� ������?\"");
		if (n == 0) {
			System.out.println(prefix + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
		}
		else {
			System.out.println(prefix + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			System.out.println(prefix + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			System.out.println(prefix + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			print(n - 1, prefix + "____");
		}
		System.out.println(prefix + "��� �亯�Ͽ���.");
	}
}
