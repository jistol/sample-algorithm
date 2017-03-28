���ȣ�� �˰����� ��ǥ���� �ϳ���ž �˰��� ���� Java �����Դϴ�.    
�ϳ���ž�� ���� ������ ���� ���� ������ �Ʒ� ��ũ�� ��ü�մϴ�.

 [�ϳ���ž - ��Ű���](https://ko.wikipedia.org/wiki/%ED%95%98%EB%85%B8%EC%9D%B4%EC%9D%98_%ED%83%91)    

���� Ǯ�� ���
----
�پ��� ������ ��Ŀ� ���� ������� ������ ���� ������ ���� �ܼ��� �����غ��ҽ��ϴ�.

![1](https://jistol.github.io/assets/img/algorithm/hanoi/1.png)

���� ���� �ϳ���ž�� 4�� ���� 3��° ��ġ�� �ű�� ���ؼ��� �Ʒ��� ���� 1,2,3������ ��� 2��° ��ġ�� �Űܵθ� �����մϴ�.

![2](https://jistol.github.io/assets/img/algorithm/hanoi/2.png)   

�׸��� �� �׸�ó�� 3�� ���� 2��° ��ġ�� �ű�� ���ؼ��� 1,2,������ �Ʒ��� ���� 3�� ��ġ�� �ű�� �˴ϴ�.

![3](https://jistol.github.io/assets/img/algorithm/hanoi/3.png)   

���� ���� �ϳ��� ���� �ű�� ���� ������ "�ش� �� ���� �ִ� ���� �ӽ� ��ġ�� �ΰ� �ش� ���� �ű��"�� �Ǹ� �� ������ ������ �ҽ��� �Ʒ��� �����ϴ�.    

```java
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
}
```

�� ������ �����ϸ� �Ʒ��� ���� �����ϰ� �˴ϴ�.    

![4](https://jistol.github.io/assets/img/algorithm/hanoi/4.png)   