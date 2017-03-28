package io.github.jistol.hanoi;

import java.util.Stack;

/**
 * Created by kimjh on 2017-03-27.
 */
public class Hanoi
{
    private static int size = 4;
    private static Stack<Integer> firstStack = new Stack<Integer>();
    private static Stack<Integer> secondStack = new Stack<Integer>();
    private static Stack<Integer> thirdStack = new Stack<Integer>();
    private static long moveCount = 0L;

    public static void main(String[] args)
    {
        for (int i = size ; i >= 1 ; i--)
        {
            firstStack.push(i);
        }

        print();
        move(size, firstStack, thirdStack, secondStack);

        System.out.println("total move count : " + moveCount);
    }

    public static void move(Integer target, Stack<Integer> srcStack, Stack<Integer> destStack, Stack<Integer> bufferStack)
    {
        if (target == 1)
        {
            moveBlock(srcStack, destStack);
            return;
        }

        move(target-1, srcStack, bufferStack, destStack);
        moveBlock(srcStack, destStack);
        move(target-1, bufferStack, destStack, srcStack);
    }

    private static void moveBlock(Stack<Integer> srcStack, Stack<Integer> destStack)
    {
        destStack.push(srcStack.pop());
        moveCount++;
        print();
    }

    public static void print()
    {
        Object[][] stacks = new Object[][]{ firstStack.toArray(), secondStack.toArray(), thirdStack.toArray() };

        for (int i = size ; i >= 1 ; i--)
        {
            System.out.print("|");
            for (int j = 0; j < stacks.length ; j++)
            {
                int cursor = i - stacks[j].length ;
                System.out.print(cursor <= 0 ? stacks[j][stacks[j].length + cursor - 1] : " ");
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("========");
    }

}
