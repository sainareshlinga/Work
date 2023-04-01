#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<ctype.h>
#define MAX_SIZE 100

int is_operator(char c);
int precedence(char c);
void infix_to_postfix(char infix[], char postfix[]);

int main() {
    char infix[MAX_SIZE];
    char postfix[MAX_SIZE];

    printf("Enter infix expression: ");
    fgets(infix, MAX_SIZE, stdin);

    infix_to_postfix(infix, postfix);

    printf("Postfix expression: %s\n", postfix);

    return 0;
}

int is_operator(char c) {
    if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
        return 1;
    } else {
        return 0;
    }
}

int precedence(char c) {
    if (c == '^') {
        return 3;
    } else if (c == '*' || c == '/') {
        return 2;
    } else if (c == '+' || c == '-') {
        return 1;
    } else {
        return 0;
    }
}

void infix_to_postfix(char infix[], char postfix[]) {
    int i, j;
    char stack[MAX_SIZE];
    int top = -1;
    int infix_length = strlen(infix);

    for (i = 0, j = 0; i < infix_length; i++) {
        if (infix[i] == ' ' || infix[i] == '\t' || infix[i] == '\n') {
            continue;
        }

        if (isdigit(infix[i])) {
            postfix[j++] = infix[i];
        } else if (is_operator(infix[i])) {
            while (top >= 0 && precedence(stack[top]) >= precedence(infix[i])) {
                postfix[j++] = stack[top--];
            }
            stack[++top] = infix[i];
        } else if (infix[i] == '(') {
            stack[++top] = infix[i];
        } else if (infix[i] == ')') {
            while (top >= 0 && stack[top] != '(') {
                postfix[j++] = stack[top--];
            }
            if (top < 0) {
                printf("Error: Mismatched parentheses\n");
                exit(1);
            }
            top--;
        } else {
            printf("Error: Invalid character '%c'\n", infix[i]);
            exit(1);
        }
    }

    while (top >= 0) {
        if (stack[top] == '(' || stack[top] == ')') {
            printf("Error: Mismatched parentheses\n");
            exit(1);
        }
        postfix[j++] = stack[top--];
    }

    postfix[j] = '\0';
}
