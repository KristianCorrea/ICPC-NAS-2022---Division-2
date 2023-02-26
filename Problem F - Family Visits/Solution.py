//Wrong Answer Testcases: 1/26
n, d = list(map(int, input().split(" ")))
mess_clean = []
days = []

for _ in range(n):
    mess, clean = list(map(int, input().split(" ")))
    mess_clean.append((mess, clean))

for _ in range(d):
    days.append(int(input()) - 1)

sections = []

prev = 0
for day in days:
    sections.append(mess_clean[prev:day+1])
    prev = day + 1

def recurse(section, i, current_mess, level):
    if i == len(section):
        return -1 if current_mess > 0 else level
    mess, clean = section[i]
    cleaned = recurse(section, i + 1, (mess+current_mess) - clean, level + 1)
    not_cleaned = recurse(section, i + 1, mess+current_mess, level)
    if cleaned == -1 or not_cleaned == -1: return max(cleaned, not_cleaned)
    return min(cleaned, not_cleaned)

results = []

for section in sections:
    results.append(recurse(section, 0, 0, 0))

print(sum(results))