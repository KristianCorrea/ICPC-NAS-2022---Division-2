// SUBMISSION FAILED: Time Limit Exceeded. Test Cases: 13/20
#include <cmath>
#include <iostream>
using namespace std;
int main() {
        int h = 0, l = 0, n = 0;
        cin >> n >> l >> h;
        int profitDays[n];
        for (int i = 0; i < n; i++) {
            cin >> profitDays[i];
        }

        int min = 300000;
        int max = 0;
        for (int window = l; window <= h; window++) {
            for (int start = 0; start < window; start++) {
                int currentWindow = 0;
                int profitSegments = 0;
                int currentProfit = 0;
                for (int i = start; i < n; i++) {
                    currentProfit += profitDays[i];
                    currentWindow++;
                    if (currentWindow == window || i == n - 1) {
                        if (currentProfit > 0) {
                            profitSegments++;
                        }
                        currentProfit = 0;
                        currentWindow = 0;
                    }
                }
                currentProfit = 0;
                for (int i = 0; i < start; i++) {
                    currentProfit += profitDays[i];
                }
                if (currentProfit > 0) {
                    profitSegments++;
                }
                if (profitSegments < min) min = profitSegments;
                if (profitSegments > max) max = profitSegments;
            }
        }
        cout << min << " " << max;
    }
