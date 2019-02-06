using System;
using System.Linq;

namespace WorthWhile.Education.Dojo.TriangleGenerator
{
    public class Triangle
    {
        public static string Create(int height)
        {
            if (height < 0)
            {
                throw new ArgumentException("height can't be negative.", nameof(height));
            }

            return Enumerable.Range(0, height)
                .Select(row => GenerateRow(row, height))
                .Aggregate("", (p, n) => p + Environment.NewLine + n) + Environment.NewLine;
        }

        private static string GenerateRow(int row, int height)
        {
            var rowLength = 2 * height - 1;
            var rowString = new char[rowLength];

            rowString[height - row - 1] = 'x';
            rowString[rowLength - (height - row)] = 'x';

            return new string(rowString).Replace("\0", " ");
        }
    }
}
