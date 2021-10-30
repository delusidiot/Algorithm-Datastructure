#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(int argc, char** argv)
{
	int test_case;
	int T;
	cin >> T;
	for (test_case = 1; test_case <= T; ++test_case)
	{
		int N;
		int num;
		vector<int> line;
		cin >> N;
		for (int i = 0; i < N; i++)
		{
			cin >> num;
			line.push_back(abs(num));
		}
		sort(line.begin(), line.end());
		num = line.at(0);
		int count = count_if(line.begin(), line.end(), [num](int i) {return i == num; });
		cout << "#" << test_case << " " << num << " " << count << endl;
	}
	return 0;
}