#!/usr/bin/env bash
# Uso: bash aplicar_commits.sh /caminho/do/repo-clonado
# Cria 1 commit por aula (+1 de documentação), usando o SEU usuário do git.
set -e
REPO="${1:?Informe o caminho do repositório clonado}"
BASE="$(cd "$(dirname "$0")" && pwd)"
FINAL="$BASE/poo-fiapride-carlos"

MSGS=(
"feat: aula1 - cria primeira classe com atributos e tipo"
"feat: aula2 - adiciona metodos com parametros e retorno"
"feat: aula3 - aplica encapsulamento com modificadores de acesso"
"feat: aula4 - cria construtores para inicializar objetos"
"feat: aula5 - cria classe associada a outra classe"
"feat: aula6 - cria heranca entre classe mae e classes filhas"
"feat: aula7 - implementa polimorfismo com sobrescrita de metodo"
"feat: aula8 - transforma classe mae em abstrata"
"feat: aula9 - cria interface com metodo abstrato"
)

cd "$REPO"
cp "$BASE/etapas/.gitignore" .gitignore
for n in 1 2 3 4 5 6 7 8 9; do
  rm -rf src
  cp -r "$BASE/etapas/aula$n/src" src
  git add -A
  git commit -m "${MSGS[$((n-1))]}"
done

# README (preencha antes!) e diagrama
mkdir -p docs
cp "$FINAL/docs/diagrama_fiapride.png" docs/
cp "$FINAL/README.md" README.md
git add -A
git commit -m "docs: adiciona README reflexivo e diagrama de classes"

echo "Pronto! Agora: git push origin main"
