﻿using System;

class ExtractBitFromInteger
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        int p = int.Parse(Console.ReadLine());

        int nRightP = n >> p;
        int bit = nRightP & 1;
        Console.WriteLine(bit);

    }
}

