using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using WorthWhile.Education.Dojo.TriangleGenerator;

namespace WorthWhile.Education.Dojo.TriangleGeneratorTest
{
    [TestClass]
    public class TriangleTests
    {
        [TestMethod]
        public void Triangle0_Create_EmptyString()
        {
            string triangle = Triangle.Create(0);
            Assert.AreEqual("" + Environment.NewLine, triangle);
        }

        [TestMethod]
        public void Triangle1_Create_X1()
        {
            string triangle = Triangle.Create(1);
            Assert.AreEqual(Environment.NewLine + "x" + Environment.NewLine, triangle);
        }

        [TestMethod]
        public void Triangle3_Create_X6()
        {
            string triangle = Triangle.Create(3);
            string expectedTriangle = "" + Environment.NewLine
                                      + "  x  " + Environment.NewLine
                                      + " x x " + Environment.NewLine
                                      + "x   x" + Environment.NewLine;

            Assert.AreEqual(expectedTriangle, triangle);
        }

        [TestMethod]
        public void TriangleNegative_Create_ArgumentException() =>
            Assert.ThrowsException<ArgumentException>(() => Triangle.Create(-1));
    }
}
