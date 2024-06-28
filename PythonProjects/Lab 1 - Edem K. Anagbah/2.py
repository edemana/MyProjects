from time import asctime

sorteD = asctime().split(' ')

print(f"Current time and date: {sorteD[4]} | {sorteD[0]},{sorteD[3]}-{sorteD[1]}-{sorteD[5]}")