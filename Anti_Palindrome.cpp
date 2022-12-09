#include<bits/stdc++.h>
using namespace std;
void solve()
{
    long long i, j, k, l, p, q, n;
    cin >> n;
    string s;
    cin >> s;
    if (n % 2 == 1)
    {
        cout << "NO" << endl;
        return;
    }
    unordered_map<char, int> m;
    for (i = 0; i < n; i++)
        m[s[i]]++;
    vector<pair<int, char>> v;
    for (auto i : m)
    {
        v.push_back(make_pair(i.second, i.first));
        cout<<i.first<<" "<<i.second<<endl;
    }

    sort(v.begin(), v.end());
    string r = "";
    for (i = 0; i < v.size(); i++)
    {
        p = v[i].first;
        if (p > (n / 2))
        {
            cout << "NO" << endl;
            return;
        }

        for (j = 0; j < p; j++)
        {
            r += v[i].second;
        }
    }
    j = n / 2;
    i = 0;
    j--;
    char c;
    int term1 = i < j;
    while (i < j)
    {
        c = r[i];
        r[i] = r[j];
        r[j] = c;
        i++;
        j--;
    }
    cout << "YES" << endl << r << endl;
}
int main(){
    int T;cin>>T;
    while(T--){
        solve();
    }
    return 0;
}